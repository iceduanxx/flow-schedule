package com.flow.web.schedule.graph;

import com.flow.web.dal.entity.Task;

import java.util.List;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
public class TaskVertex {

    private Task taskinfo;
    //
    private List<TaskVertex> preTasks;
    //下游任务
    private List<TaskVertex> nextTasks;

    public Task getTaskinfo() {
        return taskinfo;
    }

    public void setTaskinfo(Task taskinfo) {
        this.taskinfo = taskinfo;
    }

    public List<TaskVertex> getPreTasks() {
        return preTasks;
    }

    public void setPreTasks(List<TaskVertex> preTasks) {
        this.preTasks = preTasks;
    }

    public List<TaskVertex> getNextTasks() {
        return nextTasks;
    }

    public void setNextTasks(List<TaskVertex> nextTasks) {
        this.nextTasks = nextTasks;
    }
}
