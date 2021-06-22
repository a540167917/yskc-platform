package com.ys.kc.gj.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

@Data
public class PmsContentVo implements Serializable {

    @ApiModelProperty(value = "违规内容")
    private String name;

    @ApiModelProperty(value = "违规次数")
    private String count;
}
