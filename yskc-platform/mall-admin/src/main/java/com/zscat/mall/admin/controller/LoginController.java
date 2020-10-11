package com.zscat.mall.admin.controller;


import com.yskc.pms.entity.PmsChatControlRecord;
import com.yskc.pms.entity.PmsChatRecord;
import com.yskc.pms.entity.PmsGroupManagement;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsChatService;
import com.zscat.mall.admin.validator.SCaptchaValidator;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @ClassName: ChatController
 * @Description: 聊天功能
 * @author： zhangguliang
 * @date 2019年11月5日
 */
@RestController()
@RequestMapping(value = "/index")
public class LoginController {


	@GetMapping(value = "/getLogin")
    public void getLogin(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
		// 设置响应的类型格式为图片格式
		response.setContentType("image/jpeg");
		// 禁止图像缓存。
		response.setHeader("Pragma", "no-cache");
		response.setHeader("Cache-Control", "no-cache");
		response.setDateHeader("Expires", 0);
		//实例生成验证码对象
		SCaptchaValidator instance = new SCaptchaValidator(120,40,5,4);
		instance.createCode();
		//将验证码存入session
		session.setAttribute("verification", instance.getCode());
		//向页面输出验证码图片
		instance.write(response.getOutputStream());
    }
}
