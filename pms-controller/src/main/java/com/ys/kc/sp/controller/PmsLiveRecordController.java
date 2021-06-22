package com.ys.kc.sp.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.sp.entity.PmsLiveRecord;
import com.ys.kc.sp.service.PmsLiveRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台直播记录表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsLiveRecord")
public class PmsLiveRecordController {
    @Autowired
    private PmsLiveRecordService pmsLiveRecordService;
    @Resource
    private CommonResult result;
    /**
     * 功能：直播列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getLiveRecord")
    public CommonResult getLiveRecord(String offsets,String pageSizes){
        List<PmsLiveRecord> list = pmsLiveRecordService.selectPmsLiveRecordList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：直播搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountLiveRecord")
    public CommonResult accountLiveRecord(String account,String offsets,String pageSizes){
        List<PmsLiveRecord> list = pmsLiveRecordService.selectPmsLiveRecordList(account,offsets,pageSizes);
        return result.success(list);
    }
}
