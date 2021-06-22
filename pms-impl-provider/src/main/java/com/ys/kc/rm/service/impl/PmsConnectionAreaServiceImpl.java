package com.ys.kc.rm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.rm.entity.PmsConnectionArea;
import com.ys.kc.rm.mapper.PmsConnectionAreaMapper;
import com.ys.kc.rm.service.PmsConnectionAreaService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 人脉商圈表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Service
public class PmsConnectionAreaServiceImpl extends ServiceImpl<PmsConnectionAreaMapper, PmsConnectionArea> implements PmsConnectionAreaService {
    @Resource
    private PmsPageSize pmsPageSize;

    /**
     * 人脉商圈列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsConnectionAreaList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }

    /**
     * 人脉商圈搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsConnectionAreaList(String account, String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("user_account",account);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
