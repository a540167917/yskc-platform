package com.ys.kc.xt.service;

import com.ys.kc.xt.entity.PmsSystemModularity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 操作系统模块 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
public interface PmsSystemModularityService extends IService<PmsSystemModularity> {
    /**
     * 操作系统模块分页查询
     * @param administrationId 系统管理id
     * @return
     */
    List<PmsSystemModularity> selectPmsSystemModularityList(String administrationId);
}
