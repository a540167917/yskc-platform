package com.ys.kc.gj.util;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import lombok.Data;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Data
@Component
public class PmsPageSize<E>{
    private int pageNum = 1;
    private int pageSize = 10;

   public Page<E> pageNumSize(String offsets, String pageSizes){
       if((null!=offsets&&!"".equals(offsets))&&(null!=pageSizes&&!"".equals(pageSizes))){
           pageNum = Integer.parseInt(offsets);
           pageSize = Integer.parseInt(pageSizes);
       }
       Page<E> page = new Page<E>(pageNum,pageSize);
       return page;
   }

    /**
     * 分页查询
     * @param page
     * @return
     */
   public List pageResult(Page page){
       Map map = pageCount(page);
       map.put("records",page.getRecords()); //添加对象
       List list = new ArrayList();
       list.add(map);
       return list;
   }

    /**
     * 分页查询
     * @param page
     * @return
     */
   public Map pageCount(Page page){
       Map map = new HashMap();
       map.put("total",page.getTotal()); //总数量
       map.put("size",page.getSize()); //每页显示数量
       map.put("current",page.getCurrent());//当前页数
       map.put("pages",page.getPages());//总页数
       return map;
   }
}
