package com.zscat.mall.admin.controller;

import java.util.List;

import com.yskc.pms.entity.*;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsVideoService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: VideoController
 * @Description: 视频功能
 * @author： zhangguliang
 * @date 2019年11月10日
 */
@RestController()
@RequestMapping("/video")
public class VideoController {
	
	@Autowired
    private PmsVideoService pmsVideoService;

	/**
	 * 功能：聊天列表状态
	 * @param pmsVideoControlRecord 后台视频控制记录表
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
	@GetMapping(value = "/selectVideoList")
    public CommonResult selectVideoList(PmsVideoControlRecord pmsVideoControlRecord, String offsets,String pageSizes){
		if(null==pmsVideoControlRecord.getUserAccount()){
			pmsVideoControlRecord.setUserAccount("");
		}
    	int pageNo = 1;
        int pageSize=10;
    	//分页查询
    	if(StringUtils.isNumeric(offsets)) {
			pageNo=Integer.parseInt(offsets);
    	}
    	//数量
    	if(StringUtils.isNumeric(pageSizes)){
			pageSize=Integer.parseInt(pageSizes);
		}
    	List<PmsVideoControlRecord> list=  pmsVideoService.queryPmsVideoControlRecord(pmsVideoControlRecord,pageNo,pageSize);
		CommonResult result = new CommonResult();
        return result.success(list);
    }

	/**
	 * 功能：直播查询列表
	 * @param pmsLiveRecord 直播记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectLiveRecord")
     public CommonResult selectLiveRecord(PmsLiveRecord pmsLiveRecord,String offsets,String pageSizes){
		 if(null==pmsLiveRecord.getUserAccount()){
			 pmsLiveRecord.setUserAccount("");
		 }
		 int pageNo = 1;
		 int pageSize=10;
		 //分页查询
		 if(StringUtils.isNumeric(offsets)) {
			 pageNo=Integer.parseInt(offsets);
		 }
		 //条数
		 if(StringUtils.isNumeric(pageSizes)){
			 pageSize=Integer.parseInt(pageSizes);
		 }
		 List<PmsLiveRecord> list=pmsVideoService.queryPmsLiveRecord(pmsLiveRecord,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }
     /**
	 * 功能：录播查询列表
	 * @param pmsRecordedRecord 直播记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectRecordedRecord")
     public CommonResult selectPmsRecordedRecord(PmsRecordedRecord pmsRecordedRecord, String offsets, String pageSizes){
		 if(null==pmsRecordedRecord.getUserAccount()){
			 pmsRecordedRecord.setUserAccount("");
		 }
		 int pageNo = 1;
		 int pageSize=10;
		 //分页查询
		 if(StringUtils.isNumeric(offsets)) {
			 pageNo=Integer.parseInt(offsets);
		 }
		 //条数
		 if(StringUtils.isNumeric(pageSizes)){
			 pageSize=Integer.parseInt(pageSizes);
		 }
		 List<PmsRecordedRecord> list=pmsVideoService.queryPmsRecordedRecord(pmsRecordedRecord,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }
     /**
	 * 功能：插播查询列表
	 * @param pmsBreakingRecords 插播记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectBreakingRecords")
     public CommonResult selectPmsBreakingRecords(PmsBreakingRecords pmsBreakingRecords, String offsets, String pageSizes){
		 if(null==pmsBreakingRecords.getUserAccount()){
			 pmsBreakingRecords.setUserAccount("");
		 }
		 int pageNo = 1;
		 int pageSize=10;
		 //分页查询
		 if(StringUtils.isNumeric(offsets)) {
			 pageNo=Integer.parseInt(offsets);
		 }
		 //条数
		 if(StringUtils.isNumeric(pageSizes)){
			 pageSize=Integer.parseInt(pageSizes);
		 }
		 List<PmsBreakingRecords> list=pmsVideoService.queryPmsBreakingRecords(pmsBreakingRecords,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }
     /**
	 * 功能：点播查询列表
	 * @param pmsDemandRecords 点播记录
	 * @param offsets 页数
	 * @param pageSizes 数量
	 * @return
	 */
     @RequestMapping("/selectDemandRecords")
     public CommonResult selectPmsDemandRecords(PmsDemandRecords pmsDemandRecords, String offsets, String pageSizes){
		 if(null==pmsDemandRecords.getUserAccount()){
			 pmsDemandRecords.setUserAccount("");
		 }
		 int pageNo = 1;
		 int pageSize=10;
		 //分页查询
		 if(StringUtils.isNumeric(offsets)) {
			 pageNo=Integer.parseInt(offsets);
		 }
		 //条数
		 if(StringUtils.isNumeric(pageSizes)){
			 pageSize=Integer.parseInt(pageSizes);
		 }
		 List<PmsDemandRecords> list=pmsVideoService.queryPmsDemandRecords(pmsDemandRecords,pageNo,pageSize);
		 CommonResult result = new CommonResult();
    	 return result.success(list);
     }
}
