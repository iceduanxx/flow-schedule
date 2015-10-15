package com.flow.web.schedule.build;

import com.flow.web.dal.entity.Job;
import com.flow.web.service.JobStoreManager;
import com.flow.web.service.TaskStoreManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
@Service
public class JobBuilder {

    @Autowired
    JobStoreManager jobStoreManager;
    @Autowired
    TaskStoreManager taskStoreManager;

    public Job build(long jobId) {
        //1.判断job还是flow-job
        //1.获取job信息
        //2.根据jobId获取task_relation信息
        //3.通过task_relation组装对象
        return null;
    }
}
