package com.ys.kc.sp.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.sp.entity.PmsVideoPlay;
import com.ys.kc.sp.service.PmsVideoPlayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台视频播放表 姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsVideoPlay")
public class PmsVideoPlayController {
    @Autowired
    private PmsVideoPlayService pmsVideoPlayService;
    @Resource
    private CommonResult result;
    /**
     * 功能：视频播放列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getVideoPlay")
    public CommonResult getVideoPlay(String offsets,String pageSizes){
        List<PmsVideoPlay> list = pmsVideoPlayService.selectPmsVideoPlayList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：视频播放搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountVideoPlay")
    public CommonResult accountVideoPlay(String account,String offsets,String pageSizes){
        List<PmsVideoPlay> list = pmsVideoPlayService.selectPmsVideoPlayList(account,offsets,pageSizes);
        return result.success(list);
    }
}
