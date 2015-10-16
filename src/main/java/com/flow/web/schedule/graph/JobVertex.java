package com.flow.web.schedule.graph;

import java.util.List;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
public class JobVertex {

    private long id;
    //job名称
    private String jobName;
    private List<JobVertex> leftJobs;
    private List<JobVertex> rightJobs;

    //start任务
    private TaskVertex task;

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

    public List<JobVertex> getLeftJobs() {
        return leftJobs;
    }

    public void setLeftJobs(List<JobVertex> leftJobs) {
        this.leftJobs = leftJobs;
    }

    public List<JobVertex> getRightJobs() {
        return rightJobs;
    }

    public void setRightJobs(List<JobVertex> rightJobs) {
        this.rightJobs = rightJobs;
    }


}
