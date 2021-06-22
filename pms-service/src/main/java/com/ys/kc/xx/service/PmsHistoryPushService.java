package com.ys.kc.xx.service;

import com.ys.kc.xx.entity.PmsHistoryPush;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台历史推送表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
public interface PmsHistoryPushService extends IService<PmsHistoryPush> {
    /**
     * 历史推送列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsHistoryPushList(String offsets, String pageSizes);
    /**
     * 历史推送搜索列表分页查询
     * @param messageTitle 消息标题
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsHistoryPushList(String messageTitle,String offsets, String pageSizes);
    /**
     * 历史推送搜索列表分页查询
     * @param messageTitle 标题
     * @param messageContent 内容
     * @return
     */
    boolean savePmsHistoryPush(String messageTitle,String messageContent);
}
