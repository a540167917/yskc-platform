package com.ys.kc.cw.controller;


import com.ys.kc.cw.service.PmsWalletManagementService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台钱包管理姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/pmsWalletManagement")
public class PmsWalletManagementController {
    @Autowired
    private PmsWalletManagementService pmsWalletManagementService;
    @Resource
    private CommonResult result;
    /**
     * 功能：钱包管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getWalletManagement")
    public CommonResult getWalletManagement(String offsets,String pageSizes){
        List list = pmsWalletManagementService.selectPmsWalletManagementList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：钱包管理搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountWalletManagement")
    public CommonResult accountWalletManagement(String account,String offsets,String pageSizes){
        List list = pmsWalletManagementService.selectPmsWalletManagementList(account,offsets,pageSizes);
        return result.success(list);
    }
}
