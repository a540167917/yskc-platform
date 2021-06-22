package com.ys.kc.xt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.ys.kc.xt.entity.PmsAdmininistarationModularity;
import com.ys.kc.xt.entity.PmsSystemModularity;
import com.ys.kc.xt.mapper.PmsSystemModularityMapper;
import com.ys.kc.xt.service.PmsAdmininistarationModularityService;
import com.ys.kc.xt.service.PmsSystemModularityService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 操作系统模块 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Service
public class PmsSystemModularityServiceImpl extends ServiceImpl<PmsSystemModularityMapper, PmsSystemModularity> implements PmsSystemModularityService {

    @Autowired
    private PmsAdmininistarationModularityService PmsAdmininistarationModularityService;
    /**
     * 操作系统列表
     * @param administrationId 系统管理id
     * @return
     */
    @Override
    public List<PmsSystemModularity> selectPmsSystemModularityList(String administrationId) {
        List<PmsAdmininistarationModularity> pmsAdmininistarationModularitys = PmsAdmininistarationModularityService.selectAdmininistarationModularityList(administrationId);
        List<PmsSystemModularity> list=new ArrayList<>();
        System.out.println(pmsAdmininistarationModularitys);
        for (PmsAdmininistarationModularity pmsAdmininistarationModularity:pmsAdmininistarationModularitys) {
            int modularityId =  pmsAdmininistarationModularity.getModularityId();
            list.add(this.getById(modularityId));
        }
        return list;
    }
}
