package com.ys.kc.cw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 后台财务管理记录表 姓名 张古良
 * </p>
 *
 * @author zgl
 * @since 2020-12-20
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsFinancialManagement对象", description="后台财务管理记录表 姓名 张古良")
public class PmsFinancialManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "账号总余额")
    private BigDecimal accoutSumBalance;

    @ApiModelProperty(value = "账号已提现余额")
    private BigDecimal accountWithdrawalBalance;

    @ApiModelProperty(value = "账号支出总余额")
    private BigDecimal accountExpendSumBalance;


}
