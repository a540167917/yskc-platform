package com.ys.kc.lt.controller;


import com.ys.kc.lt.entity.PmsGroupManagement;
import com.ys.kc.lt.service.PmsGroupManagementService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台管理群表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsGroupManagement")
public class PmsGroupManagementController {
    @Autowired
    private PmsGroupManagementService pmsGroupManagementService;
    @Resource
    private CommonResult result;
    /**
     * 功能：群管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getGroupQuery")
    public CommonResult getGroupQuery(String offsets,String pageSizes){
        List<PmsGroupManagement> list = pmsGroupManagementService.selectPmsGroupManagementList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：群管理搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountGroupQuery")
    public CommonResult accountGroupQuery(String account,String offsets,String pageSizes){
        List<PmsGroupManagement> list = pmsGroupManagementService.selectPmsGroupManagementList(account,offsets,pageSizes);
        return result.success(list);
    }
}
