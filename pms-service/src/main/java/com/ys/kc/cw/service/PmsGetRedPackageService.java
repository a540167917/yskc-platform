package com.ys.kc.cw.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.cw.entity.PmsGetRedPackage;

import java.util.List;

/**
 * <p>
 * 后台红包领取记录表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
public interface PmsGetRedPackageService extends IService<PmsGetRedPackage> {
    /**
     * 红包列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsGetRedPackageList(String offsets, String pageSizes);
    /**
     * 红包搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsGetRedPackageList(String account,String offsets, String pageSizes);
}
