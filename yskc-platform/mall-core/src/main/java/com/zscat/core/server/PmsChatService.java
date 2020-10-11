package com.zscat.core.server;

import com.yskc.pms.entity.PmsChatControlRecord;
import com.yskc.pms.entity.PmsChatRecord;
import com.yskc.pms.entity.PmsGroupManagement;

import java.util.List;

/**
 * @ClassName: PmsChatService
 * @Description: 聊天功能
 * @author： zhangguliang
 * @date 2019年11月5日
 */
public interface PmsChatService {

    /**
     * 聊天控制记录查询
     * @param pmsChatControlRecord 后台聊天控制记录表对象
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    List<PmsChatControlRecord> queryPmsChatControlRecord(PmsChatControlRecord pmsChatControlRecord,int startRow, int pageSize);

    /**
     * 查询群管理列表
     * @param pmsGroupManagement 后台群管理表对象
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    List<PmsGroupManagement> queryHotPmsGroupManagement(PmsGroupManagement pmsGroupManagement, int startRow, int pageSize);

    /**
     * 聊天记录查询
     * @param pmsChatRecord 后台聊天记录表对象
     * @param startRow 页数
     * @param pageSize 条数
     * @return
     */
    List<PmsChatRecord> queryHotPmsChatRecord(PmsChatRecord pmsChatRecord,int startRow, int pageSize);

//    /**
//     * 姓名：张古良
//     * 修改时间：2019.7.28
//     * 根据菜名对象查询菜品
//     * @param 菜品对象
//     * @return 所有菜品
//     */
//    List<PmsMerchandise> queryHotqueryPmsMerchandiseList(PmsMerchandise pmsMerchandise);
//
//    /**
//     * 姓名：张古良
//     * 修改时间：2019.7.28
//     * 根据菜名修改菜品
//     * @param 菜品列表
//     */
//    int updatePmsMerchandise(PmsMerchandise pms);
//
//    /**
//     * 姓名：张古良
//     * 修改时间：2019.7.28
//     * 根据id删除菜品
//     * @param 菜品列表
//     */
//    int deletePmsMerchandiseById(Integer id);
//
//    /**
//     * 姓名：张古良
//     * 修改时间：2019.7.28
//     * 添加菜品
//     * @param 菜品列表
//     */
//    int insertPmsMerchandise(PmsMerchandise pms);
//
//    /**
//     * 查询某店铺的菜品分类
//     * @param storeId
//     * @return
//     */
//    List<String> queryFoodClassfiyList(Integer storeId);
}
