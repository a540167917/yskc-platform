package com.ys.kc.gj.vo;

import com.alibaba.fastjson.annotation.JSONField;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;
@Data
public class PmsLoginVo  implements Serializable {

    @ApiModelProperty(value = "注册记录id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "请求类型 1.android，2.ios，3.pc")
    private Integer type;

    @ApiModelProperty(value = "签名")
    private String sign;

    @ApiModelProperty(value = "账号")
    private String account;

    @ApiModelProperty(value = "账号类型 1 手机号 2 用户名 3 邮箱")
    @TableField("accountType")
    private Integer accountType;

    @ApiModelProperty(value = "登录方式  1 默认 2 qq 3 微信 4 支付定 ")
    @TableField("loginMethod")
    private Integer loginMethod;

    @ApiModelProperty(value = "邮箱")
    private String email;

    @ApiModelProperty(value = "创建时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    @ApiModelProperty(value = "更新时间")
    @JSONField(format = "yyyy-MM-dd HH:mm:ss")
    private Date updateTime;
}
