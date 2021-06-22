package com.ys.kc.xx.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.xx.entity.PmsMessageManagement;
import com.ys.kc.xx.service.PmsMessageManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 消息管理记录表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@RestController
@RequestMapping("/pmsMessageManagement")
public class PmsMessageManagementController {
    @Autowired
    private PmsMessageManagementService pmsMessageManagementService;
    @Resource
    private CommonResult result;
    /**
     * 功能：消息管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getMessageManagement")
    public CommonResult getMessageManagement(String offsets,String pageSizes){
        List<PmsMessageManagement> list = pmsMessageManagementService.selectPmsMessageManagementList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：消息管理搜索列表
     * @param messageMold 消息类型
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/messageMoldMessageManagement")
    public CommonResult messageMoldMessageManagement(String messageMold,String offsets,String pageSizes){
        List<PmsMessageManagement> list = pmsMessageManagementService.selectPmsMessageManagementList(messageMold,offsets,pageSizes);
        return result.success(list);
    }
}
