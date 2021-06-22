package com.ys.kc.cw.controller;


import com.ys.kc.cw.service.PmsWithdrawCheckManagementService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台提现审核管理表 姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/pmsWithdrawCheckManagement")
public class PmsWithdrawCheckManagementController {
    @Autowired
    private PmsWithdrawCheckManagementService pmsWithdrawCheckManagementService;
    @Resource
    private CommonResult result;
    /**
     * 功能：提现审核管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getWithdrawCheckManagement")
    public CommonResult getWithdrawCheckManagement(String offsets,String pageSizes){
        List list = pmsWithdrawCheckManagementService.selectPmsWithdrawCheckManagementList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：提现审核管理搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountWithdrawCheckManagement")
    public CommonResult accountWithdrawCheckManagement(String account,String offsets,String pageSizes){
        List list = pmsWithdrawCheckManagementService.selectPmsWithdrawCheckManagementList(account,offsets,pageSizes);
        return result.success(list);
    }
}
