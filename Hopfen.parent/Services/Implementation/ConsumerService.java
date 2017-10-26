package Implementation;

import org.springframework.beans.factory.annotation.Autowired;

public class ConsumerService implements Interfaces.ConsumerService {

    @Autowired
    ProducerService producerService;

    public void consume() {
	System.out.println("DefaultConsumerService: I just consumed: " + this.producerService.produce());
    }
}
