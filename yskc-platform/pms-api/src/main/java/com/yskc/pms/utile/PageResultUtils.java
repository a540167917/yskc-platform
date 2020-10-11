package com.yskc.pms.utile;
/**
 * @ClassName: PageResultUtils
 * @Description: 分页显示工具
 * @author： zhangguliang
 * @date 2019年11月10日
 */
public class PageResultUtils {

    public PageResultUtils() {
    }
    public PageResultUtils(Integer startRow, Integer pageSize) {
        this.startRow = startRow;
        this.pageSize = pageSize;
    }
    /**
     * 分页参数：起始行
     */
    private Integer startRow;

    /**
     * 分页参数：分页大小
     */
    private Integer pageSize;

    public void setStartRow(Integer startRow) {
        if(null!=getPageSize()&&startRow>0){
            startRow = ((startRow-1)*pageSize);
        }
        this.startRow = startRow;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getStartRow() {
        return startRow;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    @Override
    public String toString() {
        return "PageResultUtils{" +
                "startRow=" + startRow +
                ", pageSize=" + pageSize +
                '}';
    }
}
