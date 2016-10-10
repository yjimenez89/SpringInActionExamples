package concert;

import org.aspectj.lang.annotation.*;

/**
 * Created by ihack on 10/10/2016.
 */
@Aspect
public class Audience {

    @Pointcut("execution(** concert.Performance.perform(..))")
    public void performance(){}

    @Before("performance()")
    public void silenceCellPhones() {
        System.out.println("Silencing cell phones");
    }

    @Before("performance()")
    public void takeSeats() {
        System.out.println("Taking seats");
    }

    @AfterReturning("performance()")
    public void applause(){
        System.out.println("CLAP CLAP CLAP!!!");
    }

    @AfterThrowing("performance()")
    public void demandRefund() {
        System.out.println("Demanding a refund");
    }
}
