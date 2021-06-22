package com.ys.kc.sp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.sp.entity.PmsBreakingRecords;

import java.util.List;

/**
 * <p>
 * 后台插播记录表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsBreakingRecordsService extends IService<PmsBreakingRecords> {
    /**
     * 插播列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsBreakingRecordsList(String offsets, String pageSizes);
    /**
     * 点播列表分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsBreakingRecordsList(String account,String offsets,String pageSizes);
}
