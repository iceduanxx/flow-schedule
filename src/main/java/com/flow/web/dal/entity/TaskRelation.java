package com.flow.web.dal.entity;

import com.flow.web.dal.enums.TaskType;

import java.util.Date;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
public class TaskRelation {

    private long id;
    private long jobId;
    private Long taskPreId;
    private TaskType preTaskType;
    private Long taskNextId;
    private TaskType nextTaskType;
    private Date createTime;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getJobId() {
        return jobId;
    }

    public void setJobId(long jobId) {
        this.jobId = jobId;
    }

    public Long getTaskPreId() {
        return taskPreId;
    }

    public void setTaskPreId(Long taskPreId) {
        this.taskPreId = taskPreId;
    }

    public TaskType getPreTaskType() {
        return preTaskType;
    }

    public void setPreTaskType(TaskType preTaskType) {
        this.preTaskType = preTaskType;
    }

    public Long getTaskNextId() {
        return taskNextId;
    }

    public void setTaskNextId(Long taskNextId) {
        this.taskNextId = taskNextId;
    }

    public TaskType getNextTaskType() {
        return nextTaskType;
    }

    public void setNextTaskType(TaskType nextTaskType) {
        this.nextTaskType = nextTaskType;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
