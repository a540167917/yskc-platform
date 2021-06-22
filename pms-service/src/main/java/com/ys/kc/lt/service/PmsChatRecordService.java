package com.ys.kc.lt.service;

import com.ys.kc.lt.entity.PmsChatRecord;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台聊天记录表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsChatRecordService extends IService<PmsChatRecord> {
    /**
     * 聊天记录列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsChatRecordList(String offsets, String pageSizes);
    /**
     * 聊天记录分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsChatRecordList(String account,String offsets, String pageSizes);
}
