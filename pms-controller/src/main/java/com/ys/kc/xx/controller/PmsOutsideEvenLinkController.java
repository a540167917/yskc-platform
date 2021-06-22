package com.ys.kc.xx.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.xx.entity.PmsOutsideEvenLink;
import com.ys.kc.xx.service.PmsOutsideEvenLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * <p>
 * 后台外链连接表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@RestController
@RequestMapping("/pmsOutsideEvenLink")
public class PmsOutsideEvenLinkController {
    @Autowired
    private PmsOutsideEvenLinkService pmsOutsideEvenLinkService;
    @Resource
    private CommonResult result;
    @Value("S{user.file.path}")
    private String filePath;
    /**
     * 功能：外链连接列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getOutsideEvenLink")
    public CommonResult getOutsideEvenLink(String offsets,String pageSizes){
        List<PmsOutsideEvenLink> list = pmsOutsideEvenLinkService.selectPmsOutsideEvenLinkList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：外链连接搜索列表
     * @param name 名称
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/nameOutsideEvenLink")
    public CommonResult nameOutsideEvenLink(String name,String offsets,String pageSizes){
        List<PmsOutsideEvenLink> list = pmsOutsideEvenLinkService.selectPmsOutsideEvenLinkList(name,offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：外链连接搜索列表
     * @param name 名称
     * @param address 地址
     * @param description 描述
     * @return
     */
    @RequestMapping("/saveOutsideEvenLink")
    public CommonResult saveOutsideEvenLink(String name,String address,String description){
        boolean list = pmsOutsideEvenLinkService.savePmsOutsideEvenLink(name,address,description);
        if(list){
         return result.success("添加成功");
        }
        return result.failed();
    }
    /**
     * 图片添加功能
     */
    @RequestMapping("/saveCommodity")
    public CommonResult saveCommodity(MultipartFile multipartFile) throws IOException {
        try {
            File file = new File("F:/img/"+multipartFile.getOriginalFilename());
            System.out.println("F:/img/"+multipartFile.getOriginalFilename());
            multipartFile.transferTo(file);
            return result.success("添加成功");
        }catch (IOException e){
            e.printStackTrace();
            return result.failed();
        }
    }
}
