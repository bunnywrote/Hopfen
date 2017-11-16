package Implementation;

import java.util.ArrayList;
import java.util.List;

public class StockService implements Interfaces.StockService {

    private List<String> stock = new ArrayList<String>();

    public List<String> listProducts() {
	return stock;
    }

    public String getProduct(int position) {
	return listProducts().get(position);
    }

    public String addProduct(String product) {
	listProducts().add(product);
	return product;
    }

    public void deleteProduct(int position) {
	listProducts().remove(position);
    }

    public void updateProduct(int position, String newProduct) {
	listProducts().add(position, newProduct);
    }
}