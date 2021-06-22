package com.ys.kc.cw.controller;


import com.ys.kc.cw.service.PmsWithdrawRecordService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台钱包提现记录表 姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/pmsWithdrawRecord")
public class PmsWithdrawRecordController {
    @Autowired
    private PmsWithdrawRecordService pmsWithdrawRecordService;
    @Resource
    private CommonResult result;
    /**
     * 功能：钱包提现记录
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getWithdrawRecord")
    public CommonResult getWithdrawRecord(String account,String offsets,String pageSizes){
        List list = pmsWithdrawRecordService.selectPmsWithdrawRecordList(account,offsets,pageSizes);
        return result.success(list);
    }
}
