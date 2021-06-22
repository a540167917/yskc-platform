package com.ys.kc.cw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.cw.entity.PmsWalletManagement;

import java.util.List;

/**
 * <p>
 * 后台钱包管理姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
public interface PmsWalletManagementService extends IService<PmsWalletManagement> {
    /**
     * 钱包管理列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsWalletManagementList(String offsets, String pageSizes);
    /**
     * 钱包管理搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsWalletManagementList(String account,String offsets, String pageSizes);
}
