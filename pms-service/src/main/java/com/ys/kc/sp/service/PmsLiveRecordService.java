package com.ys.kc.sp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.sp.entity.PmsLiveRecord;

import java.util.List;

/**
 * <p>
 * 后台直播记录表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsLiveRecordService extends IService<PmsLiveRecord> {
    /**
     * 直播列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsLiveRecordList(String offsets, String pageSizes);
    /**
     * 直播列表分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsLiveRecordList(String account,String offsets,String pageSizes);
}
