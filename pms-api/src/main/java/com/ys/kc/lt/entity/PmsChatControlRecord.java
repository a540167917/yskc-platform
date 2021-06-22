package com.ys.kc.lt.entity;

import com.alibaba.fastjson.annotation.JSONField;
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
 * 后台聊天控制记录表
 * </p>
 *
 * @author zgl
 * @since 2020-12-13
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsChatControlRecord对象", description="后台聊天控制记录表")
public class PmsChatControlRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "聊天控制记录id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "聊天内容是否违法（0：否，1：是）")
    private Integer chatIllegal;

    @ApiModelProperty(value = "查看聊天内容是否违规（0：无，1：查看）")
    private Integer chatViolations;

    @ApiModelProperty(value = "账号申请时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date accountApplyTime;

    @ApiModelProperty(value = "聊天状态（0：警告，1：封号）")
    private Integer chatState;


}
