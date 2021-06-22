package com.ys.kc.cw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.cw.entity.PmsSupportRecord;

import java.util.List;

/**
 * <p>
 * 后台钱包支出记录表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
public interface PmsSupportRecordService extends IService<PmsSupportRecord> {
    /**
     * 账户支出列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsSupportRecordList(String account, String offsets, String pageSizes);
}
