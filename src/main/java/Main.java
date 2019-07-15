import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        Movie movie = context.getBean("movie", Movie.class);
        movie.setApplicationContext(context);
       System.out.println(movie.getApplicationContext().getBean("movie",Movie.class).getActor().toString());

        BeanFactory beanFactory=new AnnotationConfigApplicationContext(ConfigurationClass.class);
        movie.setBeanFactory(beanFactory);
        System.out.println(movie.getBeanFactory().getBean("movie",Movie.class).getActor().toString());
        movie.setBeanName("movie");
        System.out.println(movie.getApplicationContext().getBean(movie.getBeanName(),Movie.class).getActor().toString());





    }

}
