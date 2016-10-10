package concert.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import concert.Audience;

/**
 * Created by ihack on 11/10/2016.
 */

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "concert")
public class ConcertConfig {

    @Bean
    public Audience audience(){
        return new Audience();
    }
}
