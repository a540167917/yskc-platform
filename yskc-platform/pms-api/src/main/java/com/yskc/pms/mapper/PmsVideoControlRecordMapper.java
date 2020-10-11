package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsVideoControlRecord;
import com.yskc.pms.entity.PmsVideoControlRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsVideoControlRecordMapper {
    int countByExample(PmsVideoControlRecordExample example);

    int deleteByExample(PmsVideoControlRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsVideoControlRecord record);

    int insertSelective(PmsVideoControlRecord record);

    List<PmsVideoControlRecord> selectByExample(PmsVideoControlRecordExample example);

    PmsVideoControlRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsVideoControlRecord record, @Param("example") PmsVideoControlRecordExample example);

    int updateByExample(@Param("record") PmsVideoControlRecord record, @Param("example") PmsVideoControlRecordExample example);

    int updateByPrimaryKeySelective(PmsVideoControlRecord record);

    int updateByPrimaryKey(PmsVideoControlRecord record);
}