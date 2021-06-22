package com.ys.kc.cw.service;

import com.ys.kc.cw.entity.PmsFinancialManagement;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 后台财务管理记录表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-20
 */
public interface PmsFinancialManagementService extends IService<PmsFinancialManagement> {
    /**
     * 财务列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsFinancialManagementList(String offsets, String pageSizes);
    /**
     * 财务搜索列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsFinancialManagementList(String account,String offsets, String pageSizes);
}
