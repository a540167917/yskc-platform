package com.ys.kc.xt.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.xt.entity.PmsSystemAdministration;
import com.ys.kc.xt.service.PmsSystemAdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 系统管理 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@RestController
@RequestMapping("/pmsSystemAdministration")
public class PmsSystemAdministrationController {
    @Autowired
    private PmsSystemAdministrationService pmsSystemAdministrationService;
    @Resource
    private CommonResult result;
    /**
     * 功能：系统管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getSystemAdministration")
    public CommonResult getSystemAdministration(String offsets,String pageSizes){
        List<PmsSystemAdministration> list = pmsSystemAdministrationService.selectPmsSystemAdministrationList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：系统管理搜索列表
     * @param name 运营商名称
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/nameSystemAdministration")
    public CommonResult nameSystemAdministration(String name,String offsets,String pageSizes){
        List<PmsSystemAdministration> list = pmsSystemAdministrationService.selectPmsSystemAdministrationList(name,offsets,pageSizes);
        return result.success(list);
    }
}
