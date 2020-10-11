package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsRecordedRecord;
import com.yskc.pms.entity.PmsRecordedRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsRecordedRecordMapper {
    int countByExample(PmsRecordedRecordExample example);

    int deleteByExample(PmsRecordedRecordExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsRecordedRecord record);

    int insertSelective(PmsRecordedRecord record);

    List<PmsRecordedRecord> selectByExample(PmsRecordedRecordExample example);

    PmsRecordedRecord selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsRecordedRecord record, @Param("example") PmsRecordedRecordExample example);

    int updateByExample(@Param("record") PmsRecordedRecord record, @Param("example") PmsRecordedRecordExample example);

    int updateByPrimaryKeySelective(PmsRecordedRecord record);

    int updateByPrimaryKey(PmsRecordedRecord record);
}