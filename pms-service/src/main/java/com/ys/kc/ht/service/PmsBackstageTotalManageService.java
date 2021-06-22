package com.ys.kc.ht.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.ht.entity.PmsBackstageTotalManage;

import java.util.List;
import java.util.Map;

/**
 * <p>
 * 硬件设备数量统计表 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-23
 */
public interface PmsBackstageTotalManageService extends IService<PmsBackstageTotalManage> {
    /**
     * 硬件设备数量统计查询
     * @param account 账号
     * @return
     */
    List<PmsBackstageTotalManage> selectPmsBackstageTotalManageList(String account);

    /**
     * 违规账号次数统计查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List<Map<String,Object>> selectPmsBackstageTotalManageList(String offsets, String pageSizes);
    /**
     * 违规账号次数搜索统计查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List<Map<String,Object>> selectPmsBackstageTotalManageList(String account,String offsets, String pageSizes);
}
