package com.ys.kc.lt.controller;


import com.ys.kc.lt.service.PmsChatControlRecordService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台聊天控制记录表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-13
 */
@RestController
@RequestMapping("/pmsChatControlRecord")
public class PmsChatControlRecordController {
    @Autowired
    private PmsChatControlRecordService pmsChatControlRecordService;
    @Resource
    private CommonResult result;

    /**
     * 聊天列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getCharQuery")
    public CommonResult getCharQuery(String offsets,String pageSizes){
        List list = pmsChatControlRecordService.selectPmsChatControlRecordList(offsets,pageSizes);
       return result.success(list);
    }
    /**
     * 搜索聊天列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountCharQuery")
    public CommonResult accountCharQuery(String account,String offsets,String pageSizes){
        List list = pmsChatControlRecordService.selectPmsChatControlRecordList(account,offsets,pageSizes);
       return result.success(list);
    }
}
