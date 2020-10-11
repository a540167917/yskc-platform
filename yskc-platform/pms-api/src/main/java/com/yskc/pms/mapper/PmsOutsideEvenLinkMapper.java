package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsOutsideEvenLink;
import com.yskc.pms.entity.PmsOutsideEvenLinkExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsOutsideEvenLinkMapper {
    int countByExample(PmsOutsideEvenLinkExample example);

    int deleteByExample(PmsOutsideEvenLinkExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsOutsideEvenLink record);

    int insertSelective(PmsOutsideEvenLink record);

    List<PmsOutsideEvenLink> selectByExampleWithBLOBs(PmsOutsideEvenLinkExample example);

    List<PmsOutsideEvenLink> selectByExample(PmsOutsideEvenLinkExample example);

    PmsOutsideEvenLink selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsOutsideEvenLink record, @Param("example") PmsOutsideEvenLinkExample example);

    int updateByExampleWithBLOBs(@Param("record") PmsOutsideEvenLink record, @Param("example") PmsOutsideEvenLinkExample example);

    int updateByExample(@Param("record") PmsOutsideEvenLink record, @Param("example") PmsOutsideEvenLinkExample example);

    int updateByPrimaryKeySelective(PmsOutsideEvenLink record);

    int updateByPrimaryKeyWithBLOBs(PmsOutsideEvenLink record);

    int updateByPrimaryKey(PmsOutsideEvenLink record);
}