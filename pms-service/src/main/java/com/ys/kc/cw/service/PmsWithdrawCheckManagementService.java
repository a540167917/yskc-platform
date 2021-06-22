package com.ys.kc.cw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.cw.entity.PmsWithdrawCheckManagement;

import java.util.List;

/**
 * <p>
 * 后台提现审核管理表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
public interface PmsWithdrawCheckManagementService extends IService<PmsWithdrawCheckManagement> {
    /**
     * 提现审核列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsWithdrawCheckManagementList(String offsets, String pageSizes);
    /**
     * 提现审核搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsWithdrawCheckManagementList(String account,String offsets, String pageSizes);
}
