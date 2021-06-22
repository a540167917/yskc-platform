package com.ys.kc.cw.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 后台提现审核管理表 姓名 张古良
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsWithdrawCheckManagement对象", description="后台提现审核管理表 姓名 张古良")
public class PmsWithdrawCheckManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "提现进度(1:提现成功，2：提现待审核，3：提现失败)")
    private Long withdrawDepositSchedule;

    @ApiModelProperty(value = "提现失败原因")
    private String causeOfFailure;


}
