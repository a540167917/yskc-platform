package com.ys.kc.sz.service;

import com.ys.kc.sz.entity.PmsLogin;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 前台用户表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
public interface PmsLoginService extends IService<PmsLogin> {
    /**
     * 用户列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsLoginList(String offsets, String pageSizes);
    /**
     * 用户列表分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsLoginList(String account,String offsets,String pageSizes);
    /**
     * 用户列表分页搜索查询
     * @param id 用户id
     * @param account 账号
     * @param email 邮箱
     * @param password 密码
     * @return
     */
    boolean updatePmsLoginList(Integer id,String account,String email,String password);

}
