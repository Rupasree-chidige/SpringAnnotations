import com.stackroute.domain.Actor;
import com.stackroute.domain.Movie;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class ConfigurationClass {
    @Bean
    public Actor actor(){
        Actor actor1 = new Actor("Rupa","female",22);
        return actor1;
    }

    @Bean
    public Movie movie(){
        Movie movie1 = new Movie(actor());
        return movie1;
    }

    }
