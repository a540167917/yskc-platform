package com.ys.kc.xt.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.xt.entity.PmsSystemModularity;
import com.ys.kc.xt.service.PmsSystemModularityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 操作系统模块 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@RestController
@RequestMapping("/pmsSystemModularity")
public class PmsSystemModularityController {
    @Autowired
    private PmsSystemModularityService pmsSystemModularityService;
    @Resource
    private CommonResult result;
    /**
     * 功能：支持系统模块
     * @param administrationId 系统管理id
     * @return
     */
    @RequestMapping("/getSystemModularity")
    public CommonResult getSystemModularity(String administrationId){
        List<PmsSystemModularity> list = pmsSystemModularityService.selectPmsSystemModularityList(administrationId);
        return result.success(list);
    }
}
