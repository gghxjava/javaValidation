package com.example.entity;


import javax.ws.rs.DefaultValue;
import javax.ws.rs.QueryParam;

/**
 * 分页参数
 * @author zhangh
 *
 */
public class PageBean {
    /**
     * 分页长度
     * @default 10
     */
    @DefaultValue("10")
    @QueryParam("pageSize")
    private Integer pageSize;
    /**
     * 分页页码
     * @default 1
     */
    @DefaultValue("1")
    @QueryParam("pageNo")
    private Integer pageNo;
    /**
     * 是否需要总条数
     * @default true
     */
    @DefaultValue("true")
    @QueryParam("needTotalSize")
    private Boolean needTotalSize;
    /**
     * 是否分页
     * @default true
     */
    @DefaultValue("true")
    @QueryParam("autoPaging")
    private Boolean autoPaging;

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Boolean getNeedTotalSize() {
        return needTotalSize;
    }

    public void setNeedTotalSize(Boolean needTotalSize) {
        this.needTotalSize = needTotalSize;
    }

    public Boolean getAutoPaging() {
        return autoPaging;
    }

    public void setAutoPaging(Boolean autoPaging) {
        this.autoPaging = autoPaging;
    }

//    public <T> Page<T> toPage() {
//        Page<T> page = new Page<>();
//        if (pageNo != null) {
//            page.setPageNo(pageNo);
//        }
//        if (pageSize != null) {
//            page.setPageSize(pageSize);
//        }
//        page.setAutoCount(needTotalSize);
//        page.setAutoPaging(autoPaging);
//        page.setNeedResults(true);
//        return page;
//    }
}
