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
 * 后台外链连接表
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsOutsideEvenLink对象", description="后台外链连接表")
public class PmsOutsideEvenLink implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "外链连接id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "连接名称")
    private String name;

    @ApiModelProperty(value = "连接地址")
    private String address;

    @ApiModelProperty(value = "描述")
    private String description;


}
