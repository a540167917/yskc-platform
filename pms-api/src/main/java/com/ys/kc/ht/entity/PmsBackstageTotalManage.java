package com.ys.kc.ht.entity;

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
 * 硬件设备数量统计表
 * </p>
 *
 * @author zgl
 * @since 2020-12-23
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsBackstageTotalManage对象", description="硬件设备数量统计表")
public class PmsBackstageTotalManage implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户登录id")
    private String account;

    @ApiModelProperty(value = "警告次数")
    private Integer warnCount;

    @ApiModelProperty(value = "管理内容id")
    private Integer contentId;


}
