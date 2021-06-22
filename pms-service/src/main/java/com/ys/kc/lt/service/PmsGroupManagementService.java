package com.ys.kc.lt.service;

import com.ys.kc.lt.entity.PmsGroupManagement;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台管理群表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsGroupManagementService extends IService<PmsGroupManagement> {
    /**
     * 管理群列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsGroupManagementList(String offsets, String pageSizes);
    /**
     * 搜索管理群列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsGroupManagementList(String account,String offsets, String pageSizes);
}
