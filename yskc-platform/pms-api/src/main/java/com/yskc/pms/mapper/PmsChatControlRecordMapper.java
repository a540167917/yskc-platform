package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsChatControlRecord;
import com.yskc.pms.entity.PmsChatControlRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsChatControlRecordMapper {
    int countByExample(PmsChatControlRecordExample example);

    int deleteByExample(PmsChatControlRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsChatControlRecord record);

    int insertSelective(PmsChatControlRecord record);

    List<PmsChatControlRecord> selectByExample(PmsChatControlRecordExample example);

    PmsChatControlRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsChatControlRecord record, @Param("example") PmsChatControlRecordExample example);

    int updateByExample(@Param("record") PmsChatControlRecord record, @Param("example") PmsChatControlRecordExample example);

    int updateByPrimaryKeySelective(PmsChatControlRecord record);

    int updateByPrimaryKey(PmsChatControlRecord record);
}