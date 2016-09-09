package com.fell.ssm.deamontask;

import org.slf4j.LoggerFactory;

/**
 * Created by wb-xuzhenbin on 2016/9/9.
 */
public class TaskConfigRefreshTask {
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(TaskConfigRefreshTask.class);
    /**
     * 任务的入口，任务由spring自动调度
     */
    public void refreshLoad() {
        System.out.print("------->spring定时任务");
//        List<TaskConfig> taskConfigs = this.loadTaskCanLoad();
//        LoggerUtil.info(LOGGER, "获得可加载任务TaskConfig个数：%d", taskConfigs.size());
//        if (taskConfigs.size() > 0) {
//            taskManager.startTaskConfig(taskConfigs);
//        }
    }
}
