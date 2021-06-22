package com.ys.kc.sp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.sp.entity.PmsBreakingRecords;
import com.ys.kc.sp.mapper.PmsBreakingRecordsMapper;
import com.ys.kc.sp.service.PmsBreakingRecordsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台插播记录表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Service
public class PmsBreakingRecordsServiceImpl extends ServiceImpl<PmsBreakingRecordsMapper, PmsBreakingRecords> implements PmsBreakingRecordsService {
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 插播列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsBreakingRecordsList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 插播列表分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsBreakingRecordsList(String account,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("user_account",account);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
