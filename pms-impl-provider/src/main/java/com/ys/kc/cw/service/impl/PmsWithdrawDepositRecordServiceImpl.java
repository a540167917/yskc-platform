package com.ys.kc.cw.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.ys.kc.cw.entity.PmsWithdrawDepositRecord;
import com.ys.kc.cw.mapper.PmsWithdrawDepositRecordMapper;
import com.ys.kc.cw.service.PmsWithdrawDepositRecordService;
import com.ys.kc.gj.util.PmsPageSize;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 后台提现审核记录表 姓名 张古良 服务实现类
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@Service
public class PmsWithdrawDepositRecordServiceImpl extends ServiceImpl<PmsWithdrawDepositRecordMapper, PmsWithdrawDepositRecord> implements PmsWithdrawDepositRecordService {
    @Resource
    private PmsPageSize pmsPageSize;

    /**
     * 提现审核记录列表分页查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    @Override
    public List selectPmsWithdrawDepositRecordList(String account, String offsets, String pageSizes) {
        QueryWrapper queryWrapper =new QueryWrapper();
        queryWrapper.eq("user_account",account);
        Page page = this.page(pmsPageSize.pageNumSize(offsets,pageSizes),queryWrapper);
        List list = pmsPageSize.pageResult(page);
        return list;
    }
}
