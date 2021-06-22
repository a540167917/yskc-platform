package com.ys.kc.ht.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.gj.vo.PmsContentVo;
import com.ys.kc.ht.entity.PmsBackstageTotalManage;
import com.ys.kc.ht.entity.PmsContent;
import com.ys.kc.ht.mapper.PmsContentMapper;
import com.ys.kc.ht.service.PmsBackstageTotalManageService;
import com.ys.kc.ht.service.PmsContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 * 管理内容 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-23
 */
@Service
public class PmsContentServiceImpl extends ServiceImpl<PmsContentMapper, PmsContent> implements PmsContentService {

    @Autowired
    private PmsBackstageTotalManageService pmsBackstageTotalManageServiceImpl;
    /**
     * 管理内容
     * @param pmsContentId 管理内容id
     * @return
     */
    @Override
    public PmsContent selectPmsContent(Integer pmsContentId) {
        PmsContent pmsContent= this.getById(pmsContentId);
        return pmsContent;
    }

    /**
     * 违规次数管理内容
     * @param account 账号
     * @return
     */
    @Override
    public List selectPmsContentVoList(String account) {
        List<PmsBackstageTotalManage> lists = pmsBackstageTotalManageServiceImpl.selectPmsBackstageTotalManageList(account);
        List list = new ArrayList();
        for (PmsBackstageTotalManage pmsBackstageTotalManage:lists) {
            PmsContentVo pmsContentVo = new PmsContentVo();
            pmsContentVo.setName(this.selectPmsContent(pmsBackstageTotalManage.getId()).getName());
            pmsContentVo.setCount(pmsBackstageTotalManage.getWarnCount().toString());
            list.add(pmsContentVo);
        }
        return list;
    }
}
