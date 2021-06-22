package com.ys.kc.xx.service;

import com.ys.kc.xx.entity.PmsMessageManagement;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 消息管理记录表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
public interface PmsMessageManagementService extends IService<PmsMessageManagement> {
    /**
     * 消息管理记录列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsMessageManagementList(String offsets, String pageSizes);
    /**
     * 消息管理记录搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsMessageManagementList(String account,String offsets, String pageSizes);
}
