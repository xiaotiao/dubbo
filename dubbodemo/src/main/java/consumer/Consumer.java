package consumer;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import provider.HelloWorldService;

/**
 * Created by zhuzhenghuan on 2017/7/8.
 */
public class Consumer {

    static {

        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.INFO);


        rootLogger.addAppender(new ConsoleAppender(new PatternLayout("%-6r [%p] %c - %m%n")));
    }

    public static void  main(String[] args){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("consumer.xml");
        context.start();

        HelloWorldService helloWorldService  = (HelloWorldService)context.getBean("helloWorldService");

        String hello = helloWorldService.hello("zzh");

        System.out.println("invole remote method and return result is : "+hello);
    }
}
