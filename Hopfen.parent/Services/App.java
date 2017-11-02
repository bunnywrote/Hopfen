import Implementation.ConsumerService;
import config.ServiceConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	ConsumerService consumerService = context.getBean(ConsumerService.class);
	consumerService.consume();


	ApplicationContext context2 = new AnnotationConfigApplicationContext(ServiceConfiguration.class);

	ConsumerService consumerService2 = context2.getBean(ConsumerService.class);
	consumerService2.consume();
    }
}