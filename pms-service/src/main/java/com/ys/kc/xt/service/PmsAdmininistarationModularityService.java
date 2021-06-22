package com.ys.kc.xt.service;

import com.ys.kc.xt.entity.PmsAdmininistarationModularity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 管理与操作系统中间表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
public interface PmsAdmininistarationModularityService extends IService<PmsAdmininistarationModularity> {
    /**
     * 管理与操作系统中间表
     * @param administrationId 系统管理id
     * @return
     */
    List<PmsAdmininistarationModularity> selectAdmininistarationModularityList(String administrationId);
}
