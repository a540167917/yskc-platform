package com.ys.kc.rm.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.rm.service.PmsFriendCircleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 *  朋友圈 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsFriendCircle")
public class PmsFriendCircleController {
    @Autowired
    private PmsFriendCircleService pmsFriendCircleService;
    @Resource
    private CommonResult result;

    /**
     * 朋友圈列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getFriendCircle")
    public CommonResult getFriendCircle(String offsets,String pageSizes){
        List list = pmsFriendCircleService.selectPmsFriendCircleList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：朋友圈搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountFriendCircle")
    public CommonResult accountFriendCircle(String account,String offsets,String pageSizes){
        List list = pmsFriendCircleService.selectPmsFriendCircleList(account,offsets,pageSizes);
        return result.success(list);
    }
}
