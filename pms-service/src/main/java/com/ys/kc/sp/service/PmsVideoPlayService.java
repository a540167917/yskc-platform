package com.ys.kc.sp.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.ys.kc.sp.entity.PmsVideoPlay;

import java.util.List;

/**
 * <p>
 * 后台视频播放表 姓名 张古良 服务类
 * </p>
 *
 * @author zgl
 * @since 2020-12-18
 */
public interface PmsVideoPlayService extends IService<PmsVideoPlay> {
    /**
     * 视频播放列表分页查询
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsVideoPlayList(String offsets, String pageSizes);
    /**
     * 视频播放分页搜索查询
     * @param account 账号
     * @param offsets 页数
     * @param pageSizes 条数
     * @return
     */
    List selectPmsVideoPlayList(String account,String offsets,String pageSizes);
}
