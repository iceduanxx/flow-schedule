package com.flow.web.model;

import java.util.List;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
public class Job {

    private long id;
    //job名称
    private String jobName;
    private List<Job> leftJobs;
    private List<Job> rightJobs;

    //start任务
    private Task task;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public List<Job> getLeftJobs() {
        return leftJobs;
    }

    public void setLeftJobs(List<Job> leftJobs) {
        this.leftJobs = leftJobs;
    }

    public List<Job> getRightJobs() {
        return rightJobs;
    }

    public void setRightJobs(List<Job> rightJobs) {
        this.rightJobs = rightJobs;
    }


}
