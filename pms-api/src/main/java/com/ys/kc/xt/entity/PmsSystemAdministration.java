package com.ys.kc.xt.entity;

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
 * 系统管理
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsSystemAdministration对象", description="系统管理")
public class PmsSystemAdministration implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "运营商名称")
    private String name;

    @ApiModelProperty(value = "宽带大小")
    private String broadbandSize;

    @ApiModelProperty(value = "ip号段")
    private String ipNumber;

    @ApiModelProperty(value = "服务器名称")
    private String serverName;

    @ApiModelProperty(value = "操作系统")
    private String operatingSystem;


}
