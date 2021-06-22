package com.ys.kc.sp.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 后台插播记录表
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsBreakingRecords对象", description="后台插播记录表")
public class PmsBreakingRecords implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "后台插播记录表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "插播类型（0：广告）")
    private String waitingType;

    @ApiModelProperty(value = "插播时长（分钟）")
    private Integer waitingSize;

    @ApiModelProperty(value = "开通插播时间")
    private Date openWaitingTime;

    @ApiModelProperty(value = "操作状态（0：正常，1：临时关闭，2：取消插播权限）")
    private Integer operationStutes;


}
