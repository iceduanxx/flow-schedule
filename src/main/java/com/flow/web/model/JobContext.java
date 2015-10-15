package com.flow.web.model;

import java.util.HashMap;

public class JobContext {
	public static final String TASK_RECORD_ID = "TASK_RECORD_ID";// taskRecordId
	public static final String JOB_NAME = "JOB_NAME";// job名称
	public static final String TASK_NAME = "TASK_NAME";// task名称
	public static final String SYS_TIME = "SYS_TIME";// 系统当前时间
	public static final String USER_TIME = "USER_TIME";// 页面传输的参数
	public static final String PARAMS = "PARAMS";// task定义的参数

	private HashMap<String, String> args = new HashMap<String, String>();
	
	public JobContext(String taskRecordId, String jobName, String taskName, String sysTime, String userTime, String param) {
		args.put(TASK_RECORD_ID, taskRecordId);
		args.put(JOB_NAME, jobName);
		args.put(TASK_NAME, taskName);
		args.put(USER_TIME, userTime);
		args.put(PARAMS, param);
		args.put(SYS_TIME, sysTime);
	}
	public String getValue(String key){
		return args.get(key);
	}

}
