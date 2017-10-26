import Implementation.ConsumerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

	ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

	ConsumerService consumerService = context.getBean(ConsumerService.class);
	consumerService.consume();
    }
}