package com.ys.kc.lt.controller;


import com.ys.kc.lt.entity.PmsChatRecord;
import com.ys.kc.lt.service.PmsChatRecordService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台聊天记录表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsChatRecord")
public class PmsChatRecordController {
    @Autowired
    private PmsChatRecordService pmsChatRecordService;
    @Resource
    private CommonResult result;
    /**
     * 功能：聊天记录列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getChatRecord")
    public CommonResult getChatRecord(String offsets,String pageSizes){
        List<PmsChatRecord> list = pmsChatRecordService.selectPmsChatRecordList(offsets,pageSizes);
        return result.success(list);
    }

    /**
     * 功能：搜索聊天记录
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountChatRecord")
    public CommonResult accountChatRecord(String account,String offsets,String pageSizes){
        List<PmsChatRecord> list = pmsChatRecordService.selectPmsChatRecordList(account,offsets,pageSizes);
        return result.success(list);
    }
}
