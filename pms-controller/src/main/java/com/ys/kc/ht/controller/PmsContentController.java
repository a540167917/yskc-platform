package com.ys.kc.ht.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.ht.service.PmsContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 管理内容 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-23
 */
@RestController
@RequestMapping("/pmsContent")
public class PmsContentController {
    @Autowired
    private PmsContentService pmsContentService;
    @Resource
    private CommonResult result;

    /**
     * 管理内容
     * @param account 账号
     * @return
     */
    @RequestMapping("/getContent")
    public CommonResult getContent(String account){
        List list = pmsContentService.selectPmsContentVoList(account);
        return result.success(list);
    }
}
