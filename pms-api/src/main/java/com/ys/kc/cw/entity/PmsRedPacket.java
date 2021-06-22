package com.ys.kc.cw.entity;

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
 * 后台红包列表 姓名 张古良
 * </p>
 *
 * @author zgl
 * @since 2020-12-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsRedPacket对象", description="后台红包列表 姓名 张古良")
public class PmsRedPacket implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "红包编号")
    private String serialNumber;

    @ApiModelProperty(value = "红包类型（1.口令红包，2.任务红包，3.普通红包）")
    private Integer redBagType;

    @ApiModelProperty(value = "红包金额")
    private Long redBagMoney;

    @ApiModelProperty(value = "红包有效时间")
    private Date efficaciousTime;

    @ApiModelProperty(value = "红包创建时间")
    private Date creationTime;


}
