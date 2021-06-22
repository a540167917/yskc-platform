package com.ys.kc.cw.controller;


import com.ys.kc.cw.service.PmsGetRedPackageService;
import com.ys.kc.gj.util.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台红包领取记录表 姓名 张古良 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@RestController
@RequestMapping("/pmsGetRedPackage")
public class PmsGetRedPackageController {
    @Autowired
    private PmsGetRedPackageService pmsGetRedPackageService;
    @Resource
    private CommonResult result;
    /**
     * 功能：红包领取记录列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getGetRedPackage")
    public CommonResult getGetRedPackage(String offsets,String pageSizes){
        List list = pmsGetRedPackageService.selectPmsGetRedPackageList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：红包领取记录搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountGetRedPackage")
    public CommonResult accountGetRedPackage(String account,String offsets,String pageSizes){
        List list = pmsGetRedPackageService.selectPmsGetRedPackageList(account,offsets,pageSizes);
        return result.success(list);
    }
}
