package com.ys.kc.sz.controller;


import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.gj.vo.PmsLoginVo;
import com.ys.kc.sz.service.PmsLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 前台用户表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@RestController
@RequestMapping("/pmsLogin")
public class PmsLoginController {
    @Autowired
    private PmsLoginService pmsLoginService;
    @Resource
    private CommonResult result;
    /**
     * 功能：用户列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/getLogin")
    public CommonResult getLogin(String offsets,String pageSizes){
        List<PmsLoginVo> list = pmsLoginService.selectPmsLoginList(offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：用户搜索列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @RequestMapping("/accountLogin")
    public CommonResult accountLogin(String account,String offsets,String pageSizes){
        List<PmsLoginVo> list = pmsLoginService.selectPmsLoginList(account,offsets,pageSizes);
        return result.success(list);
    }
    /**
     * 功能：用户搜索列表
     * @param id 用户id
     * @param account 账号
     * @param email 邮箱
     * @param password 密码
     * @return
     */
    @RequestMapping("/updateLogin")
    public CommonResult updateLogin(String id,String account, String email, String password){
        Integer userId = Integer.parseInt(id);
        boolean list = pmsLoginService.updatePmsLoginList(userId,account,email,password);
        if(list){
         return result.success("修改成功");
        }else{
            return result.failed();
        }
    }

}
