import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import com.stackroute.demo.BeanLifeCycleDemo;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;


@Configuration
public class ConfigurationClass {
   /* @Bean
    public Actor actor(){
        Actor actor1 = new Actor();
        return actor1;
    }

    @Bean
    public Movie movie(){
        Movie movie = new Movie();
        return movie;
    }*/

    @Bean
    public BeanLifeCycleDemo beanLifecycle(){
        return new BeanLifeCycleDemo();
    }
}
