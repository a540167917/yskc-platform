package com.ys.kc.sp.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.sp.entity.PmsVideoControlRecord;
import com.ys.kc.sp.service.PmsVideoControlRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台视频控制记录表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsVideoControlRecord")
public class PmsVideoControlRecordController {
    @Autowired
    private PmsVideoControlRecordService pmsVideoControlRecordService;
    @Resource
    private CommonResult result;
    /**
     * 功能：视频列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getVideoControlRecord")
    public CommonResult getVideoControlRecord(String offsets,String pageSizes){
        List<PmsVideoControlRecord> list = pmsVideoControlRecordService.selectPmsVideoControlRecordList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：视频搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountVideoControlRecord")
    public CommonResult accountVideoControlRecord(String account,String offsets,String pageSizes){
        List<PmsVideoControlRecord> list = pmsVideoControlRecordService.selectPmsVideoControlRecordList(account,offsets,pageSizes);
        return result.success(list);
    }
}
