import com.stackroute.demo.BeanLifeCycleDemo;
import com.stackroute.demo.BeanPostProcessorDemo;
import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {


        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationClass.class);
        BeanLifeCycleDemo beanLifecycle = context.getBean("beanLifecycle",BeanLifeCycleDemo.class);
        BeanPostProcessorDemo beanPostProcessorDemo=context.getBean("beanPostProcessorDemo",BeanPostProcessorDemo.class);
        context.close();





    }

}
