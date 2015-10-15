package com.flow.web.dal.dao;

import com.flow.web.dal.entity.Job;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
public interface JobDao {

    public Job get(long jobId);

    public void saveJob(Job job);

    public void deleteJob(long jobId);

    public void updateJob(long jobId);

}
