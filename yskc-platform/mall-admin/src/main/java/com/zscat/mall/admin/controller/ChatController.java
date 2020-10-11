package com.zscat.mall.admin.controller;


import com.yskc.pms.entity.PmsChatControlRecord;
import com.yskc.pms.entity.PmsChatRecord;
import com.yskc.pms.entity.PmsGroupManagement;
import com.zscat.common.result.CommonResult;
import com.zscat.core.server.PmsChatService;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName: ChatController
 * @Description: 聊天功能
 * @author： zhangguliang
 * @date 2019年11月5日
 */
@RestController()
@RequestMapping(value = "/chat")
public class ChatController {
	@Autowired
	private PmsChatService pmsChatService;

	@GetMapping(value = "/getCharquery")
    public CommonResult getCharquery(PmsChatControlRecord pmsChatControlRecord, String offsets,String pageSizes){
		if(null==pmsChatControlRecord.getUserAccount()){
			pmsChatControlRecord.setUserAccount("");
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
		List<PmsChatControlRecord> list = pmsChatService.queryPmsChatControlRecord(pmsChatControlRecord,pageNo,pageSize);
		CommonResult result = new CommonResult();
		return result.success(list);
    }
    /**
	 * 功能：群管理列表
	 * @return
	 */
	@GetMapping(value = "/getGroupquery")
    public CommonResult getGroupquery(PmsGroupManagement pmsGroupManagement,String offsets,String pageSizes){
		if (null==pmsGroupManagement.getGroupAccount()){
			pmsGroupManagement.setGroupAccount("");
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
		List<PmsGroupManagement> list = pmsChatService.queryHotPmsGroupManagement(pmsGroupManagement,pageNo,pageSize);
		CommonResult result = new CommonResult();
		return result.success(list);
    }
    /**
	 * 功能：聊天记录列表
	 * @return
	 */
	@GetMapping(value = "/getChatRecord")
    public CommonResult getChatRecord(PmsChatRecord pmsChatRecord, String offsets,String pageSizes){
		if(null==pmsChatRecord.getChatAccount()){
			pmsChatRecord.setChatAccount("");
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
		List<PmsChatRecord> list = pmsChatService.queryHotPmsChatRecord(pmsChatRecord,pageNo,pageSize);
		CommonResult result = new CommonResult();
		return result.success(list);
    }
}
