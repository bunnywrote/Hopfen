public class ProducerService implements Interfaces.ProducerService {

    private String product;

    public void setProduct(String product) {
	this.product = product;
    }

    public String produce() {
	System.out.println("DefaultProducerService: I just produced: " + product);
	return product;
    }
}
