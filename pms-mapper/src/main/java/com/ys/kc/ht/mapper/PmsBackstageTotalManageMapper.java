package com.ys.kc.ht.mapper;

import com.ys.kc.ht.entity.PmsBackstageTotalManage;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * <p>
 * 硬件设备数量统计表 Mapper 接口
 * </p>
 *
 * @author zgl
 * @since 2020-12-23
 */
@Mapper
public interface PmsBackstageTotalManageMapper extends BaseMapper<PmsBackstageTotalManage> {
    /**
     *
     * 次数数量总和
     * @param account 用户账号
     */
    int selectSum(String account);
}
