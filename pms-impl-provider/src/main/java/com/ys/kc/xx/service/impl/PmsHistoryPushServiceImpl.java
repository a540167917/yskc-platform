package com.ys.kc.xx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.xx.entity.PmsHistoryPush;
import com.ys.kc.xx.mapper.PmsHistoryPushMapper;
import com.ys.kc.xx.service.PmsHistoryPushService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台历史推送表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Service
public class PmsHistoryPushServiceImpl extends ServiceImpl<PmsHistoryPushMapper, PmsHistoryPush> implements PmsHistoryPushService {
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 历史推送列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsHistoryPushList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 历史推送列表分页搜索查询
     * @param messageTitle 消息标题
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsHistoryPushList(String messageTitle,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("message_title",messageTitle);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 历史推送添加
     * @param messageTitle 消息标题
     * @param messageContent 消息内容
     * @return
     */
    @Override
    public boolean savePmsHistoryPush(String messageTitle,String messageContent) {
        PmsHistoryPush pmsHistoryPush = new PmsHistoryPush();
        pmsHistoryPush.setMessageTitle(messageTitle);
        pmsHistoryPush.setMessageContent(messageContent);
        return this.save(pmsHistoryPush);
    }
}
