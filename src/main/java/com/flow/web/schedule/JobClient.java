package com.flow.web.schedule;

/**
 * Created by xingxing.duan on 2015/10/15.
 * job 客户端
 */
public interface JobClient {

    /**
     * 启动任务
     */
    public void startJob(int jobId);

    /**
     * 启动单个task
     * @param taskId
     */
    public void startTask(int taskId);

    /**
     * 从异常task重新执行
     * @param jobRecordId
     * @param aliasName
     */
    public void startExpcetionTask(String jobRecordId, String aliasName);

    /**
     * 执行单个任务
     * @param jobRecordId
     * @param aliasName
     */
    public void startSingleTask(String jobRecordId, String aliasName);

    /**
     * 执行下游任务
     * @param serialNumber
     * @param aliasName
     */
    public void startDownStreamTask(String serialNumber,  String aliasName);

    /**
     * 停止某个task
     * @param jobInstanceId
     */
    public void stopTask(String jobInstanceId);

    /**
     * 从job里面的所有异常开始执行
     * @param jobRecordId
     */
    public void startExpcetionJob(String jobRecordId);

    /**
     * 执行当机未执行完成的job
     */
    public void startSurplusJob();
}
