package com.ys.kc.rm.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.rm.service.PmsConnectionAreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 人脉商圈表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsConnectionArea")
public class PmsConnectionAreaController {
    @Autowired
    private PmsConnectionAreaService pmsConnectionAreaService;
    @Resource
    private CommonResult result;

    /**
     * 人脉商圈列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getConnectionArea")
    public CommonResult getConnectionArea(String offsets,String pageSizes){
        List list = pmsConnectionAreaService.selectPmsConnectionAreaList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：人脉商圈搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountConnectionArea")
    public CommonResult accountConnectionArea(String account,String offsets,String pageSizes){
        List list = pmsConnectionAreaService.selectPmsConnectionAreaList(account,offsets,pageSizes);
        return result.success(list);
    }
}
