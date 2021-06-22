package com.ys.kc.sz.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.gj.util.JsonUtil;
import com.ys.kc.gj.util.PmsPageSize;
import com.ys.kc.gj.vo.PmsLoginVo;
import com.ys.kc.sz.entity.PmsLogin;
import com.ys.kc.sz.mapper.PmsLoginMapper;
import com.ys.kc.sz.service.PmsLoginService;
import net.sf.json.JSONException;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 前台用户表 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Service
public class PmsLoginServiceImpl extends ServiceImpl<PmsLoginMapper, PmsLogin> implements PmsLoginService {
    @Resource
    private PmsPageSize pmsPageSize;
    /**
     * 用户表列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsLoginList(String offsets, String pageSizes)  throws JSONException {
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes));
        List<PmsLogin> lists = page.getRecords();
        List pmsLoginVoList = new ArrayList();
        for (PmsLogin pmsLogin:lists) {
            String json = JsonUtil.toJsonStr(pmsLogin);
            PmsLoginVo pmsLoginVo =JsonUtil.fromJson(json, PmsLoginVo.class);
            pmsLoginVoList.add(pmsLoginVo);
        }
        page.setRecords(pmsLoginVoList);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
    /**
     * 用户表列表分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsLoginList(String account,String offsets, String pageSizes) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.like("account",account);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }

    /**
     * 修改用户
     * @param id 用户id
     * @param account 账号
     * @param email 邮箱
     * @param password 密码
     * @return
     */
    @Override
    public boolean updatePmsLoginList(Integer id,String account, String email, String password) {
        QueryWrapper queryWrapper = new QueryWrapper();
        queryWrapper.eq("id",id);
        PmsLogin pmsLogin = new PmsLogin();
        pmsLogin.setAccount(account);
        pmsLogin.setEmail(email);
        pmsLogin.setPassword(password);
       return this.update(pmsLogin,queryWrapper);
    }
}
