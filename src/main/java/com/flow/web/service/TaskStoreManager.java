package com.flow.web.service;

import com.flow.web.dal.entity.Task;
import com.flow.web.dal.entity.TaskRelation;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
@Service
public class TaskStoreManager {

    public List<TaskRelation> queryTaskRelationsByJobId(long jobId) {
        return null;
    }


    public Map<Integer, Task> queryTaskMapByJobId(long jobId) {
        return null;
    }
}
