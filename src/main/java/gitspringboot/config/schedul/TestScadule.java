package gitspringboot.config.schedul;

import cn.hutool.core.date.DateUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.TaskScheduler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * 定时器，和主启动位置的@EnableScheduling注解，配合使用
 */
@Component
public class TestScadule {

    @Scheduled(cron = "*/5 * * * * ?")
    public void pringData(){
        ApplicationContext ctx = new AnnotationConfigApplicationContext(StopTask.class);
        TaskScheduler taskScheduler = ctx.getBean(TaskScheduler.class);
        System.out.println(taskScheduler);
//        System.out.println(DateUtil.date() + ":我是秒级定时器");
    }

    /**
     * 时间点：固定到第60秒执行：比如：2022-06-28 10:28:00:我是分钟级定时器
     */
    @Scheduled(cron = "0 */1 * * * ?")
    public void pringMinData(){
        System.out.println(DateUtil.date() + ":我是分钟级定时器");
    }

    /**
     * 时间差：从开始时间，每隔1分钟执行一次,
     * initialDelay:初始化延迟，与fixedDelay、fixedRate有着密切的关系
     */
    @Scheduled(initialDelay=10000, fixedDelay = 60000)
    public void pringMinData1(){
        System.out.println(DateUtil.date() + ":我是分钟级定时器1");
    }

    /**
     * fixedDelay 与 fixedRate
     */
    @Scheduled(initialDelay=20000, fixedRate = 60000)
    public void pringMinData2(){
        System.out.println(DateUtil.date() + ":我是分钟级定时器2");
    }

    /**
     * 时间点：每天8点执行
     */
    @Scheduled(cron ="0 0 8 * * ?")
    public void pringTimeData3(){
        System.out.println(DateUtil.date() + ":每天定时8点执行");
    }
}
