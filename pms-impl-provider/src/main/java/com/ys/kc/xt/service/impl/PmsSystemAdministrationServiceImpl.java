package com.ys.kc.xt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.xt.entity.PmsSystemAdministration;
import com.ys.kc.xt.mapper.PmsSystemAdministrationMapper;
import com.ys.kc.xt.service.PmsSystemAdministrationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 系统管理 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Service
public class PmsSystemAdministrationServiceImpl extends ServiceImpl<PmsSystemAdministrationMapper, PmsSystemAdministration> implements PmsSystemAdministrationService {
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 系统管理列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsSystemAdministrationList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 系统管理列表分页搜索查询
     * @param name 运行商名称
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsSystemAdministrationList(String name,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("name",name);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
