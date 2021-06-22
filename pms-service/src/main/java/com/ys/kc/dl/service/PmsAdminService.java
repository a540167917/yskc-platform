package com.ys.kc.dl.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.dl.entity.PmsAdmin;

/**
 * <p>
 * 后台用户表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-28
 */
public interface PmsAdminService extends IService<PmsAdmin> {

    /**
     * 判断是否已经注册
     * @param pmsAdmin 管理员
     * @return
     */
    String selectPmsAdmin(PmsAdmin pmsAdmin);
    /**
     * 管理员注册
     * @param pmsAdmin 管理员
     * @return
     */
    boolean savePmsAdmin(PmsAdmin pmsAdmin);
    /**
     * 管理员登录
     * @param pmsAdmin 管理员
     * @return
     */
    String loginPmsAdmin(PmsAdmin pmsAdmin);
    /**
     * 获取个人信息
     * @param token 验证码
     * @return
     */
    PmsAdmin selectPmsAdmin(String token);

    /**
     * 管理员密码修改
     * @param token 验证码
     * @param phone 手机
     * @param email 邮箱
     * @param password 密码
     * @return
     */
    boolean updatePmsAdmin(String token,String phone,String email,String password);

    /**
     * 退出登录
     * @param token 验证码
     * @return
     */
    boolean quitAdmin(String token);
}
