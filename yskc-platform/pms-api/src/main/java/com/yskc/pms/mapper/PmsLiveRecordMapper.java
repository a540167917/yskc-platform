package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsLiveRecord;
import com.yskc.pms.entity.PmsLiveRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsLiveRecordMapper {
    int countByExample(PmsLiveRecordExample example);

    int deleteByExample(PmsLiveRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsLiveRecord record);

    int insertSelective(PmsLiveRecord record);

    List<PmsLiveRecord> selectByExample(PmsLiveRecordExample example);

    PmsLiveRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsLiveRecord record, @Param("example") PmsLiveRecordExample example);

    int updateByExample(@Param("record") PmsLiveRecord record, @Param("example") PmsLiveRecordExample example);

    int updateByPrimaryKeySelective(PmsLiveRecord record);

    int updateByPrimaryKey(PmsLiveRecord record);
}