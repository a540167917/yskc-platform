package com.zscat.core.server;


import com.yskc.pms.entity.*;

import java.util.List;

/**
 * @ClassName: PmsVideoService
 * @Description: 视频功能
 * @author： zhangguliang
 * @date 2019年11月10日
 */
public interface PmsVideoService {

    /**
     * 分页查询视频播放列表记录
     * @param pmsVideoControlRecord 视频列表对象
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    List<PmsVideoControlRecord> queryPmsVideoControlRecord(PmsVideoControlRecord pmsVideoControlRecord,int startRow, int pageSize);

    /**
     * 分页查询直播列表记录
     * @param pmsLiveRecord 直播视频播放
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    List<PmsLiveRecord> queryPmsLiveRecord(PmsLiveRecord pmsLiveRecord, int startRow, int pageSize);

    /**
     *  分页查询录播列表记录
     * @param pmsRecordedRecord 录播视频播放
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    List<PmsRecordedRecord> queryPmsRecordedRecord(PmsRecordedRecord pmsRecordedRecord,int startRow, int pageSize);

    /**
     * 分页查询插播列表记录
     * @param pmsBreakingRecords 插播视频播放
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    List<PmsBreakingRecords> queryPmsBreakingRecords(PmsBreakingRecords pmsBreakingRecords, int startRow, int pageSize);

    /**
     * 分页查询点播列表记录
     * @param pmsDemandRecords 点播视频播放
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    List<PmsDemandRecords> queryPmsDemandRecords(PmsDemandRecords pmsDemandRecords, int startRow, int pageSize);

//    /**
//     * 删除店铺
//     * @param id
//     * @return
//     */
//    boolean del(int id);
}
