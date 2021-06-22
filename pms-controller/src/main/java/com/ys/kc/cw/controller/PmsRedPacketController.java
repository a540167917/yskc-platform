package com.ys.kc.cw.controller;


import com.ys.kc.cw.service.PmsRedPacketService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台红包列表 姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/pmsRedPacket")
public class PmsRedPacketController {
    @Autowired
    private PmsRedPacketService pmsRedPacketService;
    @Resource
    private CommonResult result;
    /**
     * 功能：红包列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getRedPacket")
    public CommonResult getRedPacket(String offsets,String pageSizes){
        List list = pmsRedPacketService.selectPmsRedPacketList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：红包搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountRedPacket")
    public CommonResult accountRedPacket(String account,String offsets,String pageSizes){
        List list = pmsRedPacketService.selectPmsRedPacketList(account,offsets,pageSizes);
        return result.success(list);
    }
}
