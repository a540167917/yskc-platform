package com.ys.kc.sp.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.sp.entity.PmsVideoPlay;
import com.ys.kc.sp.mapper.PmsVideoPlayMapper;
import com.ys.kc.sp.service.PmsVideoPlayService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台视频播放表 姓名 张古良 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Service
public class PmsVideoPlayServiceImpl extends ServiceImpl<PmsVideoPlayMapper, PmsVideoPlay> implements PmsVideoPlayService {
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 视频播放列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsVideoPlayList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 视频播放列表分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsVideoPlayList(String account,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("user_account",account);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
