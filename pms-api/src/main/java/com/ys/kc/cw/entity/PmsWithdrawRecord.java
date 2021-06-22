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
import java.util.Date;

/**
 * <p>
 * 后台钱包提现记录表 姓名 张古良
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsWithdrawRecord对象", description="后台钱包提现记录表 姓名 张古良")
public class PmsWithdrawRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "提现余额")
    private BigDecimal withdrawBalance;

    @ApiModelProperty(value = "提现类型")
    private String withdrawType;

    @ApiModelProperty(value = "提现方式")
    private String withdrawWay;

    @ApiModelProperty(value = "提现时间")
    private Date withdrawTime;


}
