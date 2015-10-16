package com.flow.web.schedule.build;

import com.flow.web.dal.entity.Job;
import com.flow.web.dal.entity.Task;
import com.flow.web.dal.entity.TaskRelation;
import com.flow.web.dal.enums.JobType;
import com.flow.web.service.JobStoreManager;
import com.flow.web.service.TaskStoreManager;
import com.google.common.collect.Maps;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

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


        //1.获取job信息
        Job job=jobStoreManager.queryJobByJobId(jobId);
        //1.判断job还是flow-job
        if(job.getJobType().equals(JobType.ORDINARYJOB)){
            //2.根据jobId获取task_relation信息
            List<TaskRelation> taskRelations=taskStoreManager.queryTaskRelationsByJobId(jobId);
            //3.获取jobId下的所有task
            Map<Integer,Task> tasks=taskStoreManager.queryTaskMapByJobId(jobId);
            Map<Long,Long>  taskRelationMap = Maps.newHashMap();
            for(TaskRelation taskRelation:taskRelations){
                taskRelationMap.put(taskRelation.getTaskPreId(),taskRelation.getTaskNextId())
            }
        }

        //3.通过task_relation组装对象
        return null;
    }
}
