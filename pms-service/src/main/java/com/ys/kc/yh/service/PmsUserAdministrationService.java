package com.ys.kc.yh.service;

import com.ys.kc.yh.entity.PmsUserAdministration;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户管理 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
public interface PmsUserAdministrationService extends IService<PmsUserAdministration> {
    /**
     * 用户管理 列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsUserAdministrationList(String offsets, String pageSizes);
    /**
     * 用户管理 列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsUserAdministrationList(String account,String offsets, String pageSizes);
}
