package com.ys.kc.cw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.cw.entity.PmsIncomeRecords;

import java.util.List;

/**
 * <p>
 * 后台钱包收入记录表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
public interface PmsIncomeRecordsService extends IService<PmsIncomeRecords> {
    /**
     * 钱包收入记录列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsIncomeRecordsList(String account, String offsets, String pageSizes);
}
