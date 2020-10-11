package com.yskc.pms.utile.impl;


import com.yskc.pms.entity.*;
import com.yskc.pms.mapper.*;
import com.zscat.core.server.PmsVideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: PmsVideoService
 * @Description: 视频功能
 * @author： zhangguliang
 * @date 2019年11月10日
 */
@Service("pmsVideoService")
public class PmsVideoServiceImpl implements PmsVideoService {

    @Autowired
    private PmsVideoControlRecordMapper pmsVideoControlRecordMapper;
    @Autowired
    private PmsLiveRecordMapper pmsLiveRecordMapper;
    @Autowired
    private PmsRecordedRecordMapper pmsRecordedRecordMapper;
    @Autowired
    private PmsBreakingRecordsMapper pmsBreakingRecordsMapper;
    @Autowired
    private PmsDemandRecordsMapper pmsDemandRecordsMapper;

    /**
     * 分页查询视频播放列表记录
     * @param pmsVideoControlRecord 视频列表对象
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    @Override
    public List<PmsVideoControlRecord> queryPmsVideoControlRecord(PmsVideoControlRecord pmsVideoControlRecord,int startRow, int pageSize) {
        PmsVideoControlRecordExample example = new PmsVideoControlRecordExample();
        PmsVideoControlRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsVideoControlRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsVideoControlRecordMapper.selectByExample(example);
    }

    /**
     *  分页查询直播列表记录
     * @param pmsLiveRecord 直播视频播放
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    @Override
    public List<PmsLiveRecord> queryPmsLiveRecord(PmsLiveRecord pmsLiveRecord, int startRow, int pageSize) {
        PmsLiveRecordExample example = new PmsLiveRecordExample();
        PmsLiveRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsLiveRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsLiveRecordMapper.selectByExample(example);
    }

    /**
     * 分页查询录播列表记录
     * @param pmsRecordedRecord 录播视频播放
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    @Override
    public List<PmsRecordedRecord> queryPmsRecordedRecord(PmsRecordedRecord pmsRecordedRecord, int startRow, int pageSize) {
        PmsRecordedRecordExample example = new PmsRecordedRecordExample();
        PmsRecordedRecordExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsRecordedRecord.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsRecordedRecordMapper.selectByExample(example);
    }

    /**
     * 分页查询插播列表记录
     * @param pmsBreakingRecords 插播视频播放
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    @Override
    public List<PmsBreakingRecords> queryPmsBreakingRecords(PmsBreakingRecords pmsBreakingRecords, int startRow, int pageSize) {
        PmsBreakingRecordsExample example = new PmsBreakingRecordsExample();
        PmsBreakingRecordsExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsBreakingRecords.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsBreakingRecordsMapper.selectByExample(example);
    }

    /**
     * 分页查询点播列表记录
     * @param pmsDemandRecords 点播视频播放
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    @Override
    public List<PmsDemandRecords> queryPmsDemandRecords(PmsDemandRecords pmsDemandRecords, int startRow, int pageSize) {
        PmsDemandRecordsExample example = new PmsDemandRecordsExample();
        PmsDemandRecordsExample.Criteria criteria = example.createCriteria();
        criteria.andUserAccountLike("%"+pmsDemandRecords.getUserAccount()+"%");
        example.setPageSize(pageSize);
        example.setStartRow(startRow);
        return pmsDemandRecordsMapper.selectByExample(example);
    }
//    @Override
//    public boolean update(PmsStoreMerchant pmsStoreMerchant) {
//       return pmsStoreMerchantMapper.updateByPrimaryKey(pmsStoreMerchant) > 0;
//    }
//
//    @Override
//    public boolean save(PmsStoreMerchant pmsStoreMerchant) {
//        return pmsStoreMerchantMapper.insert(pmsStoreMerchant) > 0;
//    }
//
//    @Override
//    public boolean del(int id) {
//        PmsStoreMerchant pmsStoreMerchant = pmsStoreMerchantMapper.selectByPrimaryKey(id);
//        if (null != pmsStoreMerchant){
//            Integer enable = pmsStoreMerchant.getEnable();
//            enable = 0 == enable? 1 : 0;
//            pmsStoreMerchant.setEnable(enable);
//            return pmsStoreMerchantMapper.updateByPrimaryKey(pmsStoreMerchant) > 0;
//        }
//        return false;
//    }
}
