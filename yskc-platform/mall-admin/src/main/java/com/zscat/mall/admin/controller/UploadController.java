package com.zscat.mall.admin.controller;

import com.zscat.common.result.CommonResult;
import com.zscat.mall.admin.util.HttpContextUtils;
import com.zscat.mall.admin.util.SpringContextUtils;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

@Controller
public class UploadController {
    private static final Logger logger = LoggerFactory.getLogger(UploadController.class);


    @PostMapping("/upload")
    @ResponseBody
    public CommonResult upload(@RequestParam("file") MultipartFile file) {
        CommonResult commonResult = new CommonResult();
        if (file.isEmpty()) {
            return commonResult.failed();
        }
        DateFormat df = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar calendar = Calendar.getInstance();
        String dateName = df.format(calendar.getTime()) + file.getOriginalFilename();

        try {
            File path = new File(ResourceUtils.getURL("classpath:").getPath());
            if(!path.exists()) path = new File("");

            //如果上传目录为/static/image/upload/，则可以如下获取：
            File upload = new File(path.getAbsolutePath(),"static/image/upload/");
            if(!upload.exists()) upload.mkdirs();

            File dest = new File(upload,dateName);
            file.transferTo(dest);

            WebApplicationContext webApplicationContext = (WebApplicationContext)SpringContextUtils.applicationContext;
            ServletContext servletContext = webApplicationContext.getServletContext();
            String projectPath = servletContext.getContextPath();
            HttpServletRequest request = HttpContextUtils.getHttpServletRequest();

            StringBuilder sb = new StringBuilder(request.getScheme());
            sb.append("://").append(request.getServerName()).append(":").append(request.getServerPort()).append(projectPath).
                    append("/image/upload/").append(dateName);

            commonResult.success(sb.toString());
        } catch (IOException e) {
            commonResult.failed();
            logger.error(e.toString(), e);
        }
        return commonResult;
    }
}
