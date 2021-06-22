package com.ys.kc.sp.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.sp.entity.PmsDemandRecords;
import com.ys.kc.sp.service.PmsDemandRecordsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台点播记录表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@RestController
@RequestMapping("/pmsDemandRecords")
public class PmsDemandRecordsController {
    @Autowired
    private PmsDemandRecordsService pmsDemandRecordsService;
    @Resource
    private CommonResult result;
    /**
     * 功能：点播列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getDemandRecords")
    public CommonResult getDemandRecords(String offsets,String pageSizes){
        List<PmsDemandRecords> list = pmsDemandRecordsService.selectPmsDemandRecordsList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：点播搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountDemandRecords")
    public CommonResult accountDemandRecords(String account,String offsets,String pageSizes){
        List<PmsDemandRecords> list = pmsDemandRecordsService.selectPmsDemandRecordsList(account,offsets,pageSizes);
        return result.success(list);
    }
}
