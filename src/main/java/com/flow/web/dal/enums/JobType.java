package com.flow.web.dal.enums;

/**
 * Created by xingxing.duan on 2015/10/15.
 * 作业类型
 */
public enum  JobType {

    ORDINARYJOB(0,"普通job"),

    FLOWJOB(1,"flowJob");

    private int code;
    private String name;

    JobType(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
