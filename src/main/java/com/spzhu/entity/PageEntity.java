package com.spzhu.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public abstract class PageEntity {
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int pageNum;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private int pageSize;

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }
}
