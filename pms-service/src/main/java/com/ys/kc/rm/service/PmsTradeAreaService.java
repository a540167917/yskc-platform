package com.ys.kc.rm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.rm.entity.PmsTradeArea;

import java.util.List;

/**
 * <p>
 * 商圈 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsTradeAreaService extends IService<PmsTradeArea> {
    /**
     * 商圈列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsTradeAreaList(String offsets, String pageSizes);
    /**
     * 商圈搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsTradeAreaList(String account,String offsets, String pageSizes);
}
