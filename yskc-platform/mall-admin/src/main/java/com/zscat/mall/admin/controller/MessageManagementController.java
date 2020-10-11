package com.zscat.mall.admin.controller;

import com.yskc.pms.entity.PmsHistoryPush;
import com.yskc.pms.entity.PmsOutsideEvenLink;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsMessageManagementService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @ClassName: MessageManagementController
 * @Description: 消息管理 功能
 * @author： zhangguliang
 * @date 2019年11月5日
 */
@RestController()
@RequestMapping(value = "/message")
public class MessageManagementController {

    @Autowired
    private PmsMessageManagementService pmsMessageManagementService;

    /**
     * 功能：外链查询
     * @param pmsOutsideEvenLink 后台外链连接表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @GetMapping("/selectOutsideEvenList")
    public CommonResult selectOutsideEvenlist(PmsOutsideEvenLink pmsOutsideEvenLink, String offsets,String pageSizes){
        //页数
        int pageNo = 1;
        //条数
        int pageSize = 10;

        if(StringUtils.isNumeric(pageSizes)){
            pageSize = Integer.parseInt(pageSizes);
        }
        //分页查询
        if(StringUtils.isNumeric(offsets)) {
            pageNo=Integer.parseInt(offsets);
        }
        List<PmsOutsideEvenLink> pmsOutsideEvenLinkList = pmsMessageManagementService.queryPmsOutsideEvenLinkList(pmsOutsideEvenLink, pageNo,pageSize);
        CommonResult result = new CommonResult();
        return result.success(pmsOutsideEvenLinkList);
    }
    /**
     * 功能：外链添加
     * @param pmsOutsideEvenLink 外链对象
     * @return
     */
    @PostMapping("/saveOutsideEven")
    public CommonResult saveOutsideEven(PmsOutsideEvenLink pmsOutsideEvenLink){
        CommonResult result = new CommonResult();
         if(pmsMessageManagementService.savePmsOutsideEvenLink(pmsOutsideEvenLink)){
            return result.success(null);
         };
            return result.failed();
    }


    /**
     * 功能：历史推送查询
     * @param pmsHistoryPush 后台历史推送表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @GetMapping("/selectHistoryPushList")
    public CommonResult selectHistoryPushList(PmsHistoryPush pmsHistoryPush,  String offsets,String pageSizes){
        int pageNo = 1;
        int pageSize = 10;
        //分页查询
        if(StringUtils.isNumeric(offsets)) {
            pageNo=Integer.parseInt(offsets);
        }
        //条数
        if(StringUtils.isNumeric(pageSizes)){
            pageSize=Integer.parseInt(pageSizes);
        }
        List<PmsHistoryPush> pmsPmsHistoryPushList = pmsMessageManagementService.queryPmsHistoryPushList(pmsHistoryPush, pageNo,pageSize);
        CommonResult result = new CommonResult();
        return result.success(pmsPmsHistoryPushList);
    }
    /**
     * 功能：历史推送添加
     * @param pmsHistoryPush 历史推送对象
     * @return
     */
    @PostMapping("/saveHistoryPush")
    public CommonResult saveHistoryPush(PmsHistoryPush pmsHistoryPush){
        CommonResult result = new CommonResult();
        if(pmsMessageManagementService.savePmsHistoryPush(pmsHistoryPush)){
            return result.success(null);
        }
            return result.failed();
    }
}
