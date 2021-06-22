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
 * 后台红包领取记录表 姓名 张古良
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsGetRedPackage对象", description="后台红包领取记录表 姓名 张古良")
public class PmsGetRedPackage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "红包编码")
    private String redPackageNumber;

    @ApiModelProperty(value = "红包总份数")
    private Integer redPackageTotal;

    @ApiModelProperty(value = "红包剩余份数")
    private Integer redPackageResidue;

    @ApiModelProperty(value = "红包总金额")
    private BigDecimal redPackageTotalMoney;

    @ApiModelProperty(value = "红包未领完剩余时间（分钟）")
    private Integer remainingTime;

    @ApiModelProperty(value = "红包剩余金额")
    private BigDecimal remainingBalance;


}
