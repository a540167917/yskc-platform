package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsChatRecord;
import com.yskc.pms.entity.PmsChatRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsChatRecordMapper {
    int countByExample(PmsChatRecordExample example);

    int deleteByExample(PmsChatRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsChatRecord record);

    int insertSelective(PmsChatRecord record);

    List<PmsChatRecord> selectByExample(PmsChatRecordExample example);

    PmsChatRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsChatRecord record, @Param("example") PmsChatRecordExample example);

    int updateByExample(@Param("record") PmsChatRecord record, @Param("example") PmsChatRecordExample example);

    int updateByPrimaryKeySelective(PmsChatRecord record);

    int updateByPrimaryKey(PmsChatRecord record);
}