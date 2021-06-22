package com.ys.kc.sp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.sp.entity.PmsRecordedRecord;

import java.util.List;

/**
 * <p>
 * 后台录播记录表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsRecordedRecordService extends IService<PmsRecordedRecord> {
    /**
     * 录播列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsRecordedRecordList(String offsets, String pageSizes);
    /**
     * 录播列表分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsRecordedRecordList(String account,String offsets,String pageSizes);
}
