package com.ys.kc.xt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ys.kc.xt.entity.PmsAdmininistarationModularity;
import com.ys.kc.xt.mapper.PmsAdmininistarationModularityMapper;
import com.ys.kc.xt.service.PmsAdmininistarationModularityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 * 管理与操作系统中间表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Service
public class PmsAdmininistarationModularityServiceImpl extends ServiceImpl<PmsAdmininistarationModularityMapper, PmsAdmininistarationModularity> implements PmsAdmininistarationModularityService {
    /**
     * 管理与操作系统中间表查询
     * @param administrationId 系统管理id
     * @return
     */
    @Override
    public List<PmsAdmininistarationModularity> selectAdmininistarationModularityList(String administrationId) {
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("administration_id",administrationId);
        List<PmsAdmininistarationModularity> list = this.list(queryWrapper);
        return list;
    }
}
