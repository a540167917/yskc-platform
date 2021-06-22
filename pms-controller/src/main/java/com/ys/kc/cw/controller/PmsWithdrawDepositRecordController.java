package com.ys.kc.cw.controller;


import com.ys.kc.cw.service.PmsWithdrawDepositRecordService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台提现审核记录表 姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/pmsWithdrawDepositRecord")
public class PmsWithdrawDepositRecordController {
    @Autowired
    private PmsWithdrawDepositRecordService pmsWithdrawDepositRecordService;
    @Resource
    private CommonResult result;
    /**
     * 功能：提现审核记录
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getWithdrawDepositRecord")
    public CommonResult getWithdrawDepositRecord(String account,String offsets,String pageSizes){
        List list = pmsWithdrawDepositRecordService.selectPmsWithdrawDepositRecordList(account,offsets,pageSizes);
        return result.success(list);
    }
}
