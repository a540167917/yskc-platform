package com.ys.kc.cw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.cw.entity.PmsWithdrawDepositRecord;

import java.util.List;

/**
 * <p>
 * 后台提现审核记录表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
public interface PmsWithdrawDepositRecordService extends IService<PmsWithdrawDepositRecord> {
    /**
     * 提现审核记录列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsWithdrawDepositRecordList(String account, String offsets, String pageSizes);
}
