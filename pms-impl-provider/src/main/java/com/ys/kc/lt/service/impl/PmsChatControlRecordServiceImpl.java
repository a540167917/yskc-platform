package com.ys.kc.lt.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.kc.lt.entity.PmsChatControlRecord;
import com.ys.kc.lt.mapper.PmsChatControlRecordMapper;
import com.ys.kc.lt.service.PmsChatControlRecordService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.gj.util.PmsPageSize;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台聊天控制记录表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-13
 */
@Service
public class PmsChatControlRecordServiceImpl extends ServiceImpl<PmsChatControlRecordMapper, PmsChatControlRecord> implements PmsChatControlRecordService {

    @Resource
    private PmsPageSize pmsPageSize;

    /**
     * 分页查询聊天列表
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsChatControlRecordList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }

    /**
     * 分页查询搜索聊天列表
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsChatControlRecordList(String account,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("user_account",account);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
