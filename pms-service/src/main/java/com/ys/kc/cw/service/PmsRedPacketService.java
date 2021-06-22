package com.ys.kc.cw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.cw.entity.PmsRedPacket;

import java.util.List;

/**
 * <p>
 * 后台红包列表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
public interface PmsRedPacketService extends IService<PmsRedPacket> {
    /**
     * 红包列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsRedPacketList(String offsets, String pageSizes);
    /**
     * 红包搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsRedPacketList(String account,String offsets, String pageSizes);
}
