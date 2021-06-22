package com.ys.kc.cw.controller;


import com.ys.kc.cw.service.PmsFinancialManagementService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台财务管理记录表 姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/pmsFinancialManagement")
public class PmsFinancialManagementController {
    @Autowired
    private PmsFinancialManagementService pmsFinancialManagementService;
    @Resource
    private CommonResult result;
    /**
     * 功能：财务管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getFinancialManagement")
    public CommonResult getFinancialManagement(String offsets,String pageSizes){
        List list = pmsFinancialManagementService.selectPmsFinancialManagementList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：财务管理搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountFinancialManagement")
    public CommonResult accountFinancialManagement(String account,String offsets,String pageSizes){
        List list = pmsFinancialManagementService.selectPmsFinancialManagementList(account,offsets,pageSizes);
        return result.success(list);
    }
}
