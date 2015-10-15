package com.flow.web.schedule.excutor;

import com.flow.web.schedule.thread.NamedThreadFactory;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by xingxing.duan on 2015/10/15.
 */
public class JobExcutor {

    public static ExecutorService executorService = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors() * 5, new NamedThreadFactory("job-executor", false));



}
