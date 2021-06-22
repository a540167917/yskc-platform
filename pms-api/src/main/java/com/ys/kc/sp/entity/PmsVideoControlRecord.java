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
 * 后台视频控制记录表
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsVideoControlRecord对象", description="后台视频控制记录表")
public class PmsVideoControlRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "聊天记录表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "视频内容是否违法（0：否，1：有）")
    private Integer videoIllegal;

    @ApiModelProperty(value = "查看视频内容是否违规（0：无，1：查看）")
    private Integer videoViolations;

    @ApiModelProperty(value = "账号申请时间")
    private Date accountAoolyTime;

    @ApiModelProperty(value = "视频状态（0：警告，1：封号）")
    private Integer videoState;


}
