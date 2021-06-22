package com.ys.kc.rm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.rm.entity.PmsFriendCircle;

import java.util.List;

/**
 * <p>
 *  朋友圈 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsFriendCircleService extends IService<PmsFriendCircle> {
    /**
     * 朋友圈列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsFriendCircleList(String offsets, String pageSizes);
    /**
     * 朋友圈搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsFriendCircleList(String account,String offsets, String pageSizes);
}
