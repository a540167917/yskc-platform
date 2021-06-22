package com.ys.kc.cw.controller;


import com.ys.kc.cw.service.PmsIncomeRecordsService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台钱包收入记录表 姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/pmsIncomeRecords")
public class PmsIncomeRecordsController {
    @Autowired
    private PmsIncomeRecordsService pmsIncomeRecordsService;
    @Resource
    private CommonResult result;
    /**
     * 功能：钱包收入记录
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getIncomeRecords")
    public CommonResult getIncomeRecords(String account,String offsets,String pageSizes){
        List list = pmsIncomeRecordsService.selectPmsIncomeRecordsList(account,offsets,pageSizes);
        return result.success(list);
    }
}
