package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsHistoryPush;
import com.yskc.pms.entity.PmsHistoryPushExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsHistoryPushMapper {
    int countByExample(PmsHistoryPushExample example);

    int deleteByExample(PmsHistoryPushExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PmsHistoryPush record);

    int insertSelective(PmsHistoryPush record);

    List<PmsHistoryPush> selectByExampleWithBLOBs(PmsHistoryPushExample example);

    List<PmsHistoryPush> selectByExample(PmsHistoryPushExample example);

    PmsHistoryPush selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PmsHistoryPush record, @Param("example") PmsHistoryPushExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsHistoryPush record, @Param("example") PmsHistoryPushExample example);

    int updateByExample(@Param("record") PmsHistoryPush record, @Param("example") PmsHistoryPushExample example);

    int updateByPrimaryKeySelective(PmsHistoryPush record);

    int updateByPrimaryKeyWithBLOBs(PmsHistoryPush record);

    int updateByPrimaryKey(PmsHistoryPush record);
}