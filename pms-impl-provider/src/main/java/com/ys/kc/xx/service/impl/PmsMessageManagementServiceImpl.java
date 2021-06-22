package com.ys.kc.xx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.xx.entity.PmsMessageManagement;
import com.ys.kc.xx.mapper.PmsMessageManagementMapper;
import com.ys.kc.xx.service.PmsMessageManagementService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 消息管理记录表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Service
public class PmsMessageManagementServiceImpl extends ServiceImpl<PmsMessageManagementMapper, PmsMessageManagement> implements PmsMessageManagementService {
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 消息管理记录列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsMessageManagementList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 消息管理记录列表分页搜索查询
     * @param messageMold 消息类型
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsMessageManagementList(String messageMold,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("message_mold",messageMold);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
