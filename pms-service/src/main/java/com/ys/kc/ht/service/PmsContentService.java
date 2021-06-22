package com.ys.kc.ht.service;

import com.ys.kc.ht.entity.PmsContent;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 管理内容 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-23
 */
public interface PmsContentService extends IService<PmsContent> {
    /**
     * 管理内容
     * @param pmsContentId 管理内容id
     * @return
     */
    PmsContent selectPmsContent(Integer pmsContentId);

    /**
     * 违规次数管理内容查询
     * @param account 账号
     * @return
     */
    List selectPmsContentVoList(String account);
}
