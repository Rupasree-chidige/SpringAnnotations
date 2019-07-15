import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


    @Configuration
    public class ConfigurationClass {
        @Bean
        public Actor actor() {
            Actor actor1 = new Actor();
            return actor1;
        }

        @Bean
        public Movie movie() {
            Movie movie1 = new Movie();
            return movie1;


        }
    }
