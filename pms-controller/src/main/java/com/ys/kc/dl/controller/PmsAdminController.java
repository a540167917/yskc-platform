package com.ys.kc.dl.controller;


import com.ys.kc.dl.entity.PmsAdmin;
import com.ys.kc.dl.service.PmsAdminService;
import com.ys.kc.gj.util.CommonResult;
import com.ys.kc.gj.util.EncodUtil;
import com.ys.kc.gj.util.RegisterCheckout;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * 后台用户表 前端控制器
 * </p>
 *
 * @author zgl
 * @since 2020-12-28
 */
@RestController
@RequestMapping("/pmsAdmin")
public class PmsAdminController {
    @Autowired
    private PmsAdminService pmsAdminService;
    @Resource
    private CommonResult result;
    @Resource
    private RegisterCheckout registerCheckout;
    /**
     * 功能：管理员注册
     * @param pmsAdmin 管理员
     * @return
     */
    @RequestMapping("/savePmsAdmin")
    public CommonResult savePmsAdmin(PmsAdmin pmsAdmin){
        if(!registerCheckout.isPhone(pmsAdmin.getPhon())){
            return result.failed("电话输入错误！");
        }
        if(!registerCheckout.isEmail(pmsAdmin.getEmail())){
            return result.failed("邮箱输入错误！");
        }
        if (!registerCheckout.isPassword(pmsAdmin.getPassword())){
            String password = "密码强度太弱！";
            if(pmsAdmin.getPassword().length()>8 && pmsAdmin.getPassword().length()<17){
                password = "输入错误，密码长度输入9到16位，必须包含大小写字母！";
            }
            return result.failed(password);
        }
        System.out.println(pmsAdminService.selectPmsAdmin(pmsAdmin).length());
        if(pmsAdminService.selectPmsAdmin(pmsAdmin).length()<2) {
            pmsAdmin.setPassword(EncodUtil.EncoderByMd5(pmsAdmin.getPassword()));
            boolean list = pmsAdminService.savePmsAdmin(pmsAdmin);
            if (list) {
                return result.success("注册成功");
            }
            return result.failed();
        }
            return result.failed(pmsAdminService.selectPmsAdmin(pmsAdmin));
    }
    /**
     * 功能：管理员登录
     * @param pmsAdmin 管理员
     * @return
     */
    @RequestMapping("/loginPmsAdmin")
    public CommonResult loginPmsAdmin(PmsAdmin pmsAdmin){
        pmsAdmin.setPassword(EncodUtil.EncoderByMd5(pmsAdmin.getPassword()));
       String token = pmsAdminService.loginPmsAdmin(pmsAdmin);
       if(null!=token){
          Map map = new HashMap();
          map.put("token",token);
        return result.success(map);
       }
       return result.failed();
    }
    /**
     * 功能：获取个人信息
     * @param token 验证码
     * @return
     */
    @RequestMapping("/getPmsAdmin")
    public CommonResult getPmsAdmin(String token){
        PmsAdmin pmsAdmin = pmsAdminService.selectPmsAdmin(token);
       if(null!=pmsAdmin){
        return result.success(pmsAdmin);
       }
       return result.failed();
    }

    /**
     *  功能：管理员密码修改
     * @param token 验证码
     * @param phone 电话
     * @param email 邮箱
     * @param password 密码
     * @return
     */
    @RequestMapping("/updatePmsAdmin")
    public CommonResult updatePmsAdmin(String token, String phone, String email, String password){
        boolean pmsAdmin = pmsAdminService.updatePmsAdmin(token,phone,email,password);
       if(pmsAdmin){
        return result.success("设置成功");
       }
       return result.failed();
    }
    /**
     * 功能：退出登录
     * @param token 验证码
     * @return
     */
    @RequestMapping("/quitLogin")
    public CommonResult quitLogin(String token){
        boolean pmsAdmin = pmsAdminService.quitAdmin(token);
       if(pmsAdmin){
        return result.success("退出");
       }
       return result.failed();
    }
}
