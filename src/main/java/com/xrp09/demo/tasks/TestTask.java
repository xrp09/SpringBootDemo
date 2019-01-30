package com.xrp09.demo.tasks;

import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

@Component
public class TestTask {

	private static final SimpleDateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");

	// 定义每过3秒执行任务
//    @Scheduled(fixedRate = 3000)    //fixwdRate 执行范围每隔3秒执行 单位ms
//	@Scheduled(cron = "4-40 * * * * ?") //cron表达式 灵活（quatz和job都支持）生成地址：http://cron.qqe2.com/
    public void reportCurrentTime() {
        System.out.println("现在时间：" + dateFormat.format(new Date()));
    }
}
