package com.flow.web.dal.enums;

/**
 * Created by xingxing.duan on 2015/10/15.
 * 任务类型美剧类
 */
public enum TaskType {

    START(1, "start任务"),

    END(2, "end任务"),
    ORDINARY(3, "普通task");

    private int code;
    private String name;

    TaskType(int code, String name) {
        this.code = code;
        this.name = name;
    }
}
