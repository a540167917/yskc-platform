package com.ys.kc.sz.entity;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
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
 * 前台用户表
 * </p>
 *
 * @author zgl
 * @since 2020-12-21
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsLogin对象", description="前台用户表")
public class PmsLogin implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "注册记录id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "密码")
    private String password;

    @ApiModelProperty(value = "账号类型 1 手机号 2 用户名 3 邮箱")
    @TableField("accountType")
    private Integer accountType;

    @ApiModelProperty(value = "请求类型 1.android，2.ios，3.pc")
    private Integer type;

    @ApiModelProperty(value = "签名")
    private String sign;

    @ApiModelProperty(value = "个人数字信息编码")
    private String token;

    @ApiModelProperty(value = "登录方式  1 默认 2 qq 3 微信 4 支付定 ")
    @TableField("loginMethod")
    private Integer loginMethod;

    @ApiModelProperty(value = "管理员id")
    private Integer pmsAdminId;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "创建时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;

    @ApiModelProperty(value = "状态 0正常 1警告状态")
    private Integer status;


}
