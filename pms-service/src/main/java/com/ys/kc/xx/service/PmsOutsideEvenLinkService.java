package com.ys.kc.xx.service;

import com.ys.kc.xx.entity.PmsOutsideEvenLink;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台外链连接表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
public interface PmsOutsideEvenLinkService extends IService<PmsOutsideEvenLink> {
    /**
     * 外链连接列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsOutsideEvenLinkList(String offsets, String pageSizes);
    /**
     * 外链连接列表分页查询
     * @param name 名称
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsOutsideEvenLinkList(String name,String offsets, String pageSizes);
    /**
     * 外链连接添加
     * @param name 名称
     * @param address 地址
     * @param description 描述
     * @return
     */
    boolean savePmsOutsideEvenLink(String name,String address, String description);
}
