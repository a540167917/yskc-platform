package com.yskc.pms.mapper;

import com.yskc.pms.entity.PmsGroupManagement;
import com.yskc.pms.entity.PmsGroupManagementExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PmsGroupManagementMapper {
    int countByExample(PmsGroupManagementExample example);

    int deleteByExample(PmsGroupManagementExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(PmsGroupManagement record);

    int insertSelective(PmsGroupManagement record);

    List<PmsGroupManagement> selectByExample(PmsGroupManagementExample example);

    PmsGroupManagement selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") PmsGroupManagement record, @Param("example") PmsGroupManagementExample example);

    int updateByExample(@Param("record") PmsGroupManagement record, @Param("example") PmsGroupManagementExample example);

    int updateByPrimaryKeySelective(PmsGroupManagement record);

    int updateByPrimaryKey(PmsGroupManagement record);
}