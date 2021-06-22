package com.ys.kc.cw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.cw.entity.PmsFinancialManagement;
import com.ys.kc.cw.mapper.PmsFinancialManagementMapper;
import com.ys.kc.cw.service.PmsFinancialManagementService;
import com.ys.kc.gj.util.PmsPageSize;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台财务管理记录表 姓名 张古良 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-20
 */
@Service
public class PmsFinancialManagementServiceImpl extends ServiceImpl<PmsFinancialManagementMapper, PmsFinancialManagement> implements PmsFinancialManagementService {
    @Resource
    private PmsPageSize pmsPageSize;

    /**
     * 分页查询财务管理列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsFinancialManagementList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 财务管理搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsFinancialManagementList(String account, String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("user_account",account);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
