import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie = context.getBean("movie",Movie.class);
        System.out.println(movie.getActor().toString());




    }

}
