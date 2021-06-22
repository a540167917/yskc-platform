package com.ys.kc.xx.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.xx.entity.PmsHistoryPush;
import com.ys.kc.xx.service.PmsHistoryPushService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台历史推送表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@RestController
@RequestMapping("/pmsHistoryPush")
public class PmsHistoryPushController {
    @Autowired
    private PmsHistoryPushService pmsHistoryPushService;
    @Resource
    private CommonResult result;
    /**
     * 功能：历史推送列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getHistoryPush")
    public CommonResult getHistoryPush(String offsets,String pageSizes){
        List<PmsHistoryPush> list = pmsHistoryPushService.selectPmsHistoryPushList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：历史推送搜索列表
     * @param messageTitle 消息标题
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/messageTitleHistoryPush")
    public CommonResult messageTitleHistoryPush(String messageTitle,String offsets,String pageSizes){
        List<PmsHistoryPush> list = pmsHistoryPushService.selectPmsHistoryPushList(messageTitle,offsets,pageSizes);
        return result.success(list);
    }

    /**
     * 功能：历史推送添加
     * @param messageTitle 消息标题
     * @param messageContent 消息内容
     * @return
     */
    @RequestMapping("/saveHistoryPush")
    public CommonResult saveHistoryPush(String messageTitle,String messageContent){
        boolean list = pmsHistoryPushService.savePmsHistoryPush(messageTitle,messageContent);
        if(list){
            return result.success("添加成功");
        }
        return result.failed();
    }
}
