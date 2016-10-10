package concert;

import concert.config.ConcertConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ihack on 11/10/2016.
 */
public class ConcertMain {

    public static void main(String args[]) {
        /*
        ApplicationContext context = new AnnotationConfigApplicationContext(ConcertConfig.class);
        Stadium stadium = context.getBean(concert.Stadium.class);

        stadium.startConcert();
        */

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("META-INF/spring/concert-config.xml");
        Stadium stadium = context.getBean(Stadium.class);

        stadium.startConcert();
    }
}
