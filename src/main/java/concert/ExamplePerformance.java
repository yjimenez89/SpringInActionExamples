package concert;

import org.springframework.stereotype.Component;

/**
 * Created by ihack on 11/10/2016.
 */

@Component
public class ExamplePerformance implements Performance{

    public void perform() {
        System.out.println();
        System.out.println();

        System.out.println("Welcome!!!!!!!!!!!!");
        System.out.println("Today is a great day in which we learn AOP");
        System.out.println("So get ready.");

        System.out.println();
    }
}
