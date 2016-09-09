package com.fell.ssm.quartz;

import com.fell.ssm.deamontask.TaskConfigRefreshTask;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by wb-xuzhenbin on 2016/9/1.
 */
public class MobileByCreatleJob {
    /**
     * 执行数据查询任务，运行配置的任务
     */
    @Autowired
    private  TaskConfigRefreshTask taskConfigRefreshTask;
    public void doIt() {
        taskConfigRefreshTask.refreshLoad();
    }

}
