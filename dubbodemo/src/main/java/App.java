import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by zhuzhenghuan on 2017/7/8.
 */
public class App {

    private static final Logger logger = Logger.getLogger(App.class);

    static {

        Logger rootLogger = Logger.getRootLogger();
        rootLogger.setLevel(Level.INFO);


        rootLogger.addAppender(new ConsoleAppender(new PatternLayout("%-6r [%p] %c - %m%n")));
    }

    public static void main(String[] args) throws Exception{

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider.xml");

        context.start();

        System.in.read();
    }
}
