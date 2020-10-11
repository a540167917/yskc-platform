package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsBreakingRecords;
import com.yskc.pms.entity.PmsBreakingRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsBreakingRecordsMapper {
    int countByExample(PmsBreakingRecordsExample example);

    int deleteByExample(PmsBreakingRecordsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsBreakingRecords record);

    int insertSelective(PmsBreakingRecords record);

    List<PmsBreakingRecords> selectByExample(PmsBreakingRecordsExample example);

    PmsBreakingRecords selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsBreakingRecords record, @Param("example") PmsBreakingRecordsExample example);

    int updateByExample(@Param("record") PmsBreakingRecords record, @Param("example") PmsBreakingRecordsExample example);

    int updateByPrimaryKeySelective(PmsBreakingRecords record);

    int updateByPrimaryKey(PmsBreakingRecords record);
}