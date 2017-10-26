public class ConsumerService implements Interfaces.ConsumerService {

    ProducerService producerService;

    public void consume() {
	System.out.println("DefaultConsumerService: I just consumed: " + this.producerService.produce());
    }
}
