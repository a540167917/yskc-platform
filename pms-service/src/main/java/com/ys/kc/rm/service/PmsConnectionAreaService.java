package com.ys.kc.rm.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.rm.entity.PmsConnectionArea;

import java.util.List;

/**
 * <p>
 * 人脉商圈表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsConnectionAreaService extends IService<PmsConnectionArea> {
    /**
     * 人脉商圈列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsConnectionAreaList(String offsets, String pageSizes);
    /**
     * 人脉商圈搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsConnectionAreaList(String account,String offsets, String pageSizes);
}
