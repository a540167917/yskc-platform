package com.ys.kc.sp.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.sp.entity.PmsBreakingRecords;
import com.ys.kc.sp.service.PmsBreakingRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台插播记录表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsBreakingRecords")
public class PmsBreakingRecordsController {
    @Autowired
    private PmsBreakingRecordsService pmsBreakingRecordsService;
    @Resource
    private CommonResult result;
    /**
     * 功能：插播列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getBreakingRecords")
    public CommonResult getBreakingRecords(String offsets,String pageSizes){
        List<PmsBreakingRecords> list = pmsBreakingRecordsService.selectPmsBreakingRecordsList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：插播搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountBreakingRecords")
    public CommonResult accountBreakingRecords(String account,String offsets,String pageSizes){
        List<PmsBreakingRecords> list = pmsBreakingRecordsService.selectPmsBreakingRecordsList(account,offsets,pageSizes);
        return result.success(list);
    }
}
