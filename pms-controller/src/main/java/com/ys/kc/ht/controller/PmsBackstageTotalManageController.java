package com.ys.kc.ht.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.ht.service.PmsBackstageTotalManageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 硬件设备数量统计表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-23
 */
@RestController
@RequestMapping("/pmsBackstageTotalManage")
public class PmsBackstageTotalManageController {
    @Autowired
    private PmsBackstageTotalManageService pmsBackstageTotalManageService;
    @Resource
    private CommonResult result;

    /**
     * 后台总管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getBackstageTotalManage")
    public CommonResult getBackstageTotalManage(String offsets, String pageSizes){
        List list = pmsBackstageTotalManageService.selectPmsBackstageTotalManageList(offsets, pageSizes);
        return result.success(list);
    }
    /**
     * 后台总管理搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountBackstageTotalManage")
    public CommonResult accountBackstageTotalManage(String account,String offsets, String pageSizes){
        List list = pmsBackstageTotalManageService.selectPmsBackstageTotalManageList(account,offsets, pageSizes);
        return result.success(list);
    }
}
