package com.ys.kc.dl.service.impl;

import com.auth0.jwt.interfaces.DecodedJWT;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.dl.entity.PmsAdmin;
import com.ys.kc.dl.mapper.PmsAdminMapper;
import com.ys.kc.dl.service.PmsAdminService;
import com.ys.kc.gj.util.JwtTokenUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 后台用户表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-28
 */
@Service
public class PmsAdminServiceImpl extends ServiceImpl<PmsAdminMapper, PmsAdmin> implements PmsAdminService {
    @Autowired
    private JwtTokenUtil jwtTokenUtil;

    /**
     *
     * @param pmsAdmin 管理员
     * @return
     */
    @Override
    public String selectPmsAdmin(PmsAdmin pmsAdmin) {
        QueryWrapper<PmsAdmin> account = new QueryWrapper();
        account.eq("account",pmsAdmin.getAccount());
           if(null!=this.getOne(account)){
                return "账号已存在";
           };
        QueryWrapper<PmsAdmin> phone = new QueryWrapper();
        phone.eq("phon",pmsAdmin.getPhon());
         if(null!=this.getOne(phone)){
            return "电话已注册，请重新输入电话号码";
         };
        QueryWrapper<PmsAdmin> email = new QueryWrapper();
        email.eq("email",pmsAdmin.getEmail());
         if(null!=this.getOne(email)){
            return "邮箱已注册，请重新输入邮箱";
         };
        return "1";
    }

    /**
     * 管理员注册
     * @param pmsAdmin 管理员
     * @return
     */
    @Override
    public boolean savePmsAdmin(PmsAdmin pmsAdmin) {
        return this.save(pmsAdmin);
    }

    /**
     * 管理员登录
     * @param pmsAdmin 管理员
     * @return
     */
    @Override
    public String loginPmsAdmin(PmsAdmin pmsAdmin) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("account",pmsAdmin.getAccount());
        queryWrapper.eq("password",pmsAdmin.getPassword());
        System.out.println(this.getOne(queryWrapper));
        if(null!=this.getOne(queryWrapper)){
            return jwtTokenUtil.token(pmsAdmin.getAccount(),pmsAdmin.getPassword());
        };
        return null;
    }

    /**
     * 获取个人信息
     * @param token 验证码
     * @return
     */
    @Override
    public PmsAdmin selectPmsAdmin(String token) {
        DecodedJWT jwt = jwtTokenUtil.getInformation(token);
        String account = jwt.getClaims().get("username").asString();
        String password = jwt.getClaims().get("password").asString();
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("account",account);
        queryWrapper.eq("password",password);
        return this.getOne(queryWrapper);
    }

    /**
     * 管理员密码修改
     * @param token 验证码
     * @param phone 手机
     * @param email 邮箱
     * @param password 密码
     * @return
     */
    @Override
    public boolean updatePmsAdmin(String token, String phone, String email, String password) {
        DecodedJWT jwt = jwtTokenUtil.getInformation(token);
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("account",jwt.getClaims().get("username").asString());
        queryWrapper.eq("password",jwt.getClaims().get("password").asString());
        PmsAdmin pmsAdmin = new PmsAdmin();
        pmsAdmin.setPhon(phone);
        pmsAdmin.setEmail(email);
        pmsAdmin.setPassword(password);
        return this.update(pmsAdmin,queryWrapper);
    }

    /**
     * 退出登录
     * @param token 验证码
     * @return
     */
    @Override
    public boolean quitAdmin(String token) {
        if(null!=this.selectPmsAdmin(token)){
            return true;
        }
        return false;
    }
}
