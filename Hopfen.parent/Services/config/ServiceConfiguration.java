package config;

import Implementation.ConsumerService;
import Implementation.ProducerService;
import Implementation.StockService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfiguration {

    @Bean
    ProducerService producerService() {
	ProducerService producerService = new ProducerService();
	producerService.setProduct("an apple");
	return producerService;
    }

    @Bean
    ConsumerService consumerService() {
	ConsumerService consumerService = new ConsumerService();
	return consumerService;
    }

    @Bean
    StockService stockService() {
	StockService stockService = new StockService();
	return  stockService;
    }
}