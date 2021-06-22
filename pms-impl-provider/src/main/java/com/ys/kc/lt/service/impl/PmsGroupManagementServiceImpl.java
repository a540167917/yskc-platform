package com.ys.kc.lt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.kc.lt.entity.PmsGroupManagement;
import com.ys.kc.lt.mapper.PmsGroupManagementMapper;
import com.ys.kc.lt.service.PmsGroupManagementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.gj.util.PmsPageSize;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台管理群表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Service
public class PmsGroupManagementServiceImpl extends ServiceImpl<PmsGroupManagementMapper, PmsGroupManagement> implements PmsGroupManagementService {
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 分页查询管理群列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsGroupManagementList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 分页查询管理群列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsGroupManagementList(String account,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("group_account",account);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
