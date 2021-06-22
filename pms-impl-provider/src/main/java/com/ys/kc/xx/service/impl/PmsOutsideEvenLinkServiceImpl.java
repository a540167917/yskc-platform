package com.ys.kc.xx.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.xx.entity.PmsOutsideEvenLink;
import com.ys.kc.xx.mapper.PmsOutsideEvenLinkMapper;
import com.ys.kc.xx.service.PmsOutsideEvenLinkService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台外链连接表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Service
public class PmsOutsideEvenLinkServiceImpl extends ServiceImpl<PmsOutsideEvenLinkMapper, PmsOutsideEvenLink> implements PmsOutsideEvenLinkService {
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 外链连接列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsOutsideEvenLinkList(String offsets, String pageSizes) {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 外链连接列表分页搜索查询
     * @param name 名称
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsOutsideEvenLinkList(String name,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("name",name);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 外链连接添加
     * @param name 名称
     * @param address 地址
     * @param description 描述
     * @return
     */
    @Override
    public boolean savePmsOutsideEvenLink(String name,String address, String description) {
        PmsOutsideEvenLink pmsOutsideEvenLink = new PmsOutsideEvenLink();
        pmsOutsideEvenLink.setName(name);
        pmsOutsideEvenLink.setAddress(address);
        pmsOutsideEvenLink.setDescription(description);
        return this.save(pmsOutsideEvenLink);
    }
}
