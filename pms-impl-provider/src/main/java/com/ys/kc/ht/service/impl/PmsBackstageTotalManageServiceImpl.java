package com.ys.kc.ht.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.ht.entity.PmsBackstageTotalManage;
import com.ys.kc.ht.mapper.PmsBackstageTotalManageMapper;
import com.ys.kc.ht.service.PmsBackstageTotalManageService;
import com.ys.kc.sz.entity.PmsLogin;
import com.ys.kc.sz.service.PmsLoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>
 * 硬件设备数量统计表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-23
 */
@Service
public class PmsBackstageTotalManageServiceImpl extends ServiceImpl<PmsBackstageTotalManageMapper, PmsBackstageTotalManage> implements PmsBackstageTotalManageService {

    @Autowired
    private PmsLoginService pmsLoginService;
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 硬件设备数量统计
     * @param account 账号
     * @return
     */
    @Override
    public List<PmsBackstageTotalManage> selectPmsBackstageTotalManageList(String account) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("account",account);
       List<PmsBackstageTotalManage> list =  this.list(queryWrapper);
        return list;
    }
    /**
     * 违规账号次数统计分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List<Map<String,Object>> selectPmsBackstageTotalManageList(String offsets, String pageSizes) {
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("status",1);
        Page page =  pmsLoginService.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List<PmsLogin> lists = page.getRecords();
         Map maps =  pmsPageSize.pageCount(page);
        List<Map<String,Object>> list = new ArrayList<>();
        for (PmsLogin pmsLogin:lists) {
            Map<String,Object> map = new HashMap<>();
            map.put("account",pmsLogin.getAccount());
            map.put("count",baseMapper.selectSum(pmsLogin.getAccount()));
            list.add(map);
        }
        maps.put("records",list);
        List<Map<String,Object>> arrayList = new ArrayList<>();
        arrayList.add(maps);
        return arrayList;
    }
    /**
     * 违规账号次数统计分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List<Map<String,Object>> selectPmsBackstageTotalManageList(String account,String offsets, String pageSizes) {
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("status",1);
        queryWrapper.like("account",account);
        Page page =  pmsLoginService.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List<PmsLogin> lists = page.getRecords();
         Map maps =  pmsPageSize.pageCount(page);
        List<Map<String,Object>> list = new ArrayList<>();
        for (PmsLogin pmsLogin:lists) {
            Map<String,Object> map = new HashMap<>();
            map.put("account",pmsLogin.getAccount());
            map.put("count",baseMapper.selectSum(pmsLogin.getAccount()));
            list.add(map);
        }
        maps.put("records",list);
        List<Map<String,Object>> arrayList = new ArrayList<>();
        arrayList.add(maps);
        return arrayList;
    }
}
