package com.zjb.task;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 2009\8\20 0020.
 */
@Component
public class TaskTest {
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

    //    springboot 的cron表达式只能是6位，不支持对年的指定
//    @Scheduled(fixedRate = 3000)
    @Scheduled(cron = "1-5 * * * * ? ")
//    @Scheduled(fixedDelay = 3000)
    public void reportCurrentTime() {
        System.out.println(dateFormat.format(new Date()));
    }
}