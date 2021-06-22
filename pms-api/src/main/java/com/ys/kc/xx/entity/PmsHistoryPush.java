package com.ys.kc.xx.entity;

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
 * 后台历史推送表
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsHistoryPush对象", description="后台历史推送表")
public class PmsHistoryPush implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "历史推送id")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "消息标题")
    private String messageTitle;

    @ApiModelProperty(value = "可选值列表，以逗号隔开")
    private String messageContent;

    @ApiModelProperty(value = "消息发布时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date pushTime;


}
