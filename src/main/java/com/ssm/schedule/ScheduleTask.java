package com.ssm.schedule;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.time.DateFormatUtils;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时任务
 * @author qp
 * @date 2019/4/12 10:29
 */
@Component
@Slf4j
public class ScheduleTask {

    // 每隔30分钟执行一次
    @Scheduled(cron = "0 0/30 * * * ?")
    public void printSay() {
        log.info("ScheduleTask" + DateFormatUtils.format(new Date(),"yyyy-MM-dd HH:mm:ss"));
    }

}

