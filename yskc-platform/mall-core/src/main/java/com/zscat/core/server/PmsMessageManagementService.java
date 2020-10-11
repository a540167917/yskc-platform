package com.zscat.core.server;

import com.yskc.pms.entity.PmsHistoryPush;
import com.yskc.pms.entity.PmsOutsideEvenLink;

import java.util.List;
/**
 * @ClassName: PmsMessageManagementService
 * @Description: 消息管理业务功能
 * @author： zhangguliang
 * @date 2019年11月5日
 */
public interface PmsMessageManagementService {
    /**
     * 外链链接表列表查询
     * @param pmsOutsideEvenLink 外链链接表对象
     * @param pageSize 分页条数量
     * @param startRow 显示页数
     * @return
     */
    List<PmsOutsideEvenLink> queryPmsOutsideEvenLinkList(PmsOutsideEvenLink pmsOutsideEvenLink,int startRow,int pageSize);

    /**
     * 外链链接表添加
     * @param pmsOutsideEvenLink 外链链接表对象
     * @return
     */
    boolean savePmsOutsideEvenLink(PmsOutsideEvenLink pmsOutsideEvenLink);

    /**
     * 历史推送列表查询
     * @param pmsHistoryPush 历史推送对象
     * @param pageSize 分页条数量
     * @param startRow 显示页数
     * @return
     */
    List<PmsHistoryPush> queryPmsHistoryPushList(PmsHistoryPush pmsHistoryPush, int startRow, int pageSize);

    /**
     * 历史推送添加
     * @param pmsHistoryPush 历史推送对象
     * @return
     */
    boolean savePmsHistoryPush(PmsHistoryPush pmsHistoryPush);
}
