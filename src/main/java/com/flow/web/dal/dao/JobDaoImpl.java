package com.flow.web.dal.dao;

import com.flow.web.dal.entity.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
@Repository
public class JobDaoImpl implements JobDao {

    @Autowired
    JdbcTemplate jdbcTemplate;

    @Override
    public Job get(long jobId) {
        return null;
    }

    @Override
    public void saveJob(Job job) {

    }

    @Override
    public void deleteJob(long jobId) {

    }

    @Override
    public void updateJob(long jobId) {

    }
}
