package com.ys.kc.sp.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.sp.entity.PmsRecordedRecord;
import com.ys.kc.sp.service.PmsRecordedRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台录播记录表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsRecordedRecord")
public class PmsRecordedRecordController {
    @Autowired
    private PmsRecordedRecordService pmsRecordedRecordService;
    @Resource
    private CommonResult result;
    /**
     * 功能：录播列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getRecordedRecord")
    public CommonResult getRecordedRecord(String offsets,String pageSizes){
        List<PmsRecordedRecord> list = pmsRecordedRecordService.selectPmsRecordedRecordList(offsets,pageSizes);
        return result.success(list);
    }

    /**
     * 功能：录播搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountRecordedRecord")
    public CommonResult accountRecordedRecord(String account,String offsets,String pageSizes){
        List<PmsRecordedRecord> list = pmsRecordedRecordService.selectPmsRecordedRecordList(account,offsets,pageSizes);
        return result.success(list);
    }
}
