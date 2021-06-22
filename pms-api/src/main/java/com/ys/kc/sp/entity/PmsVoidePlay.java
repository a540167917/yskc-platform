package com.ys.kc.sp.entity;

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
 * 后台视频播放表 姓名 张古良
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsVoidePlay对象", description="后台视频播放表 姓名 张古良")
public class PmsVoidePlay implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "视频编号")
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "用户账号")
    private String userAccount;

    @ApiModelProperty(value = "视频内容")
    private String videoContent;

    @ApiModelProperty(value = "视频审核进度")
    private String videoCheckSchedule;

    @ApiModelProperty(value = "视频审核失败原因")
    private String videoCheckDefeatedCause;

    @ApiModelProperty(value = "申请审核时间")
    private Date applyCheckTime;


}
