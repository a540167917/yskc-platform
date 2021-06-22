package com.ys.kc.cw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.cw.entity.PmsRechargeRecord;

import java.util.List;

/**
 * <p>
 * 后台充值记录表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
public interface PmsRechargeRecordService extends IService<PmsRechargeRecord> {
    /**
     * 钱包充值记录列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsRechargeRecordList(String account, String offsets, String pageSizes);
}
