package com.ys.kc.yh.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.yh.entity.PmsUserAdministration;
import com.ys.kc.yh.service.PmsUserAdministrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户管理 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@RestController
@RequestMapping("/pmsUserAdministration")
public class PmsUserAdministrationController {
    @Autowired
    private PmsUserAdministrationService pmsUserAdministrationService;
    @Resource
    private CommonResult result;
    /**
     * 功能：用户管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getUserAdministration")
    public CommonResult getUserAdministration(String offsets,String pageSizes){
        List list = pmsUserAdministrationService.selectPmsUserAdministrationList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：用户管理搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountUserAdministration")
    public CommonResult accountUserAdministration(String account,String offsets,String pageSizes){
        List<PmsUserAdministration> list = pmsUserAdministrationService.selectPmsUserAdministrationList(account,offsets,pageSizes);
        return result.success(list);
    }
}
