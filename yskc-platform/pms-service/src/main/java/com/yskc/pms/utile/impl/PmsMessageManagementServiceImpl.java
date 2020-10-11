package com.yskc.pms.utile.impl;

import com.yskc.pms.entity.PmsHistoryPush;
import com.yskc.pms.entity.PmsHistoryPushExample;
import com.yskc.pms.entity.PmsOutsideEvenLink;
import com.yskc.pms.entity.PmsOutsideEvenLinkExample;
import com.yskc.pms.mapper.PmsHistoryPushMapper;
import com.yskc.pms.mapper.PmsOutsideEvenLinkMapper;
import com.zscat.core.server.PmsMessageManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @ClassName: PmsMessageManagementService
 * @Description: 消息管理业务处理功能
 * @author： zhangguliang
 * @date 2019年11月5日
 */
@Service("pmsMessageManagementService")
public class PmsMessageManagementServiceImpl implements PmsMessageManagementService {
    @Autowired
    private PmsOutsideEvenLinkMapper pmsOutsideEvenLinkMapper;
    @Autowired
    private PmsHistoryPushMapper pmsHistoryPushMapper;
    /**
     * 外链链接表列表查询
     * @param pmsOutsideEvenLink 外链链接表对象
     * @param pageSize 分页条数量
     * @param startRow 显示页数
     * @return
     */
    @Override
    public List<PmsOutsideEvenLink> queryPmsOutsideEvenLinkList(PmsOutsideEvenLink pmsOutsideEvenLink,int startRow,int pageSize) {
        PmsOutsideEvenLinkExample example = new PmsOutsideEvenLinkExample();
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsOutsideEvenLinkMapper.selectByExample(example);
    }
    /**
     * 外链链接表列表添加
     * @param pmsOutsideEvenLink 外链链接表对象
     * @return
     */
    @Override
    public boolean savePmsOutsideEvenLink(PmsOutsideEvenLink pmsOutsideEvenLink) {
       int size = pmsOutsideEvenLinkMapper.insertSelective(pmsOutsideEvenLink);
        System.out.println(size);
       if(size>0){
           return true;
       }
        return false;
    }

    /**
     * 历史推送列表查询
     * @param pmsHistoryPush 历史推送对象
     * @param pageSize 分页条数量
     * @param startRow 显示页数
     * @return
     */
    @Override
    public List<PmsHistoryPush> queryPmsHistoryPushList(PmsHistoryPush pmsHistoryPush, int startRow, int pageSize) {
        PmsHistoryPushExample example = new PmsHistoryPushExample();
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsHistoryPushMapper.selectByExample(example);
    }
    /**
     * 历史推送添加
     * @param pmsHistoryPush 历史推送对象
     * @return
     */
    @Override
    public boolean savePmsHistoryPush(PmsHistoryPush pmsHistoryPush) {
        int size = pmsHistoryPushMapper.insertSelective(pmsHistoryPush);
        System.out.println(size);
        if (size>0){
            return true;
        }
        return false;
    }
}
