package com.ys.kc.rm.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.rm.service.PmsTradeAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 商圈 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsTradeArea")
public class PmsTradeAreaController {
    @Autowired
    private PmsTradeAreaService pmsTradeAreaService;
    @Resource
    private CommonResult result;

    /**
     * 商圈列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getTradeArea")
    public CommonResult getTradeArea(String offsets,String pageSizes){
        List list = pmsTradeAreaService.selectPmsTradeAreaList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：商圈搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountTradeArea")
    public CommonResult accountTradeArea(String account,String offsets,String pageSizes){
        List list = pmsTradeAreaService.selectPmsTradeAreaList(account,offsets,pageSizes);
        return result.success(list);
    }
}
