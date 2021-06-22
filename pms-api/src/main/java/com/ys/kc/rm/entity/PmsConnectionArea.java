package com.ys.kc.rm.entity;

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
 * 人脉商圈表
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsConnectionArea对象", description="人脉商圈表")
public class PmsConnectionArea implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "人脉商圈表id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "发布内容是否违规，1不是0是")
    private Integer illegal;

    @ApiModelProperty(value = "警告次数")
    private Integer warnCount;

    @ApiModelProperty(value = "违规发布内容")
    private String illegalContext;

    @ApiModelProperty(value = "违规发布次数")
    private Integer illegalCount;

    @ApiModelProperty(value = "操作：1警告2封号3删除内容")
    private Integer operation;

    @ApiModelProperty(value = "操作人")
    private String operator;

    @ApiModelProperty(value = "创建时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;


}
