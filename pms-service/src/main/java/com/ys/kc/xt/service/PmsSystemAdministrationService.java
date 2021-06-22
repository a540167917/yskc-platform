package com.ys.kc.xt.service;

import com.ys.kc.xt.entity.PmsSystemAdministration;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 系统管理 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
public interface PmsSystemAdministrationService extends IService<PmsSystemAdministration> {
    /**
     * 系统管理列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsSystemAdministrationList(String offsets, String pageSizes);
    /**
     * 系统管理列表分页查询
     * @param name 运营商名称
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsSystemAdministrationList(String name,String offsets, String pageSizes);
}
