import com.stackroute.domain.Movie;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie = context.getBean("movie", Movie.class);
        System.out.println(movie.getActor().toString());
        Movie movie1 = context.getBean("movie", Movie.class);
        System.out.println(movie==movie1);
        




    }

}
