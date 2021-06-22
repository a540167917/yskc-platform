package com.ys.kc.xx.entity;

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
 * 消息管理记录表
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsMessageManagement对象", description="消息管理记录表")
public class PmsMessageManagement implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "连接标题")
    private String connectTitle;

    @ApiModelProperty(value = "消息类型")
    private String messageMold;

    @ApiModelProperty(value = "当日点击量")
    private String dayClickQuantity;

    @ApiModelProperty(value = "周点击量")
    private String weeksClickQuantity;

    @ApiModelProperty(value = "月点击量")
    private String monthClickQuantity;

    @ApiModelProperty(value = "总点击量")
    private String totalClickQuantity;


}
