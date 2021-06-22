package com.ys.kc.lt.service;

import com.ys.kc.lt.entity.PmsChatControlRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台聊天控制记录表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-13
 */
public interface PmsChatControlRecordService extends IService<PmsChatControlRecord> {
    /**
     * 聊天列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
     List selectPmsChatControlRecordList(String offsets,String pageSizes);
    /**
     * 聊天分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
     List selectPmsChatControlRecordList(String account,String offsets,String pageSizes);
}
