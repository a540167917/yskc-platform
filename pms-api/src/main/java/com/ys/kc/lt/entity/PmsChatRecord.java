package com.ys.kc.lt.entity;

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
 * 后台聊天记录表
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="PmsChatRecord对象", description="后台聊天记录表")
public class PmsChatRecord implements Serializable {

    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "后台聊天记录id")
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "聊天账号")
    private String chatAccount;

    @ApiModelProperty(value = "聊天文件文档路径")
    private String chatFilePath;

    @ApiModelProperty(value = "聊天图片视频路径")
    private String chatPicturePath;

    @ApiModelProperty(value = "链接地址")
    private String connectionLocation;

    @ApiModelProperty(value = "记录时间")
    private Date recordTime;


}
