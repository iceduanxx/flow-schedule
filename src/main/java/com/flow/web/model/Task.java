package com.flow.web.model;

import java.util.List;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
public class Task {

    private long id;
    //任务名称
    private String taskName;
    //类路径
    private String classPath;
    //参数
    private String parameter;
    //上游任务
    private List<Task> preTasks;
    //下游任务
    private List<Task> nextTasks;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getClassPath() {
        return classPath;
    }

    public void setClassPath(String classPath) {
        this.classPath = classPath;
    }

    public String getParameter() {
        return parameter;
    }

    public void setParameter(String parameter) {
        this.parameter = parameter;
    }

    public List<Task> getPreTasks() {
        return preTasks;
    }

    public void setPreTasks(List<Task> preTasks) {
        this.preTasks = preTasks;
    }

    public List<Task> getNextTasks() {
        return nextTasks;
    }

    public void setNextTasks(List<Task> nextTasks) {
        this.nextTasks = nextTasks;
    }
}
