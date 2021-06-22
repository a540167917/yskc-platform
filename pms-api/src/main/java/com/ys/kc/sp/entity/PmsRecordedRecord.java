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
 * 后台录播记录表
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsRecordedRecord对象", description="后台录播记录表")
public class PmsRecordedRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "后台录播记录表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "近期发布时间")
    private Date recentTime;

    @ApiModelProperty(value = "录播时长（分钟）")
    private Integer recordedSize;

    @ApiModelProperty(value = "开通录播时间")
    private Date openRecordedTime;

    @ApiModelProperty(value = "操作状态（0：正常，1：临时关闭，2：取消录播权限）")
    private Integer operationStatus;


}
