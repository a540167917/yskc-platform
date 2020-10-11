package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsDemandRecords;
import com.yskc.pms.entity.PmsDemandRecordsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsDemandRecordsMapper {
    int countByExample(PmsDemandRecordsExample example);

    int deleteByExample(PmsDemandRecordsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsDemandRecords record);

    int insertSelective(PmsDemandRecords record);

    List<PmsDemandRecords> selectByExample(PmsDemandRecordsExample example);

    PmsDemandRecords selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsDemandRecords record, @Param("example") PmsDemandRecordsExample example);

    int updateByExample(@Param("record") PmsDemandRecords record, @Param("example") PmsDemandRecordsExample example);

    int updateByPrimaryKeySelective(PmsDemandRecords record);

    int updateByPrimaryKey(PmsDemandRecords record);
}