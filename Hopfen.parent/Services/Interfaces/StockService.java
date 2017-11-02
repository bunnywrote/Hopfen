package Interfaces;
import java.util.List;

public interface StockService {
    List<String> listProducts();
    String getProduct(int position);
    String addProduct(String todo);
    void deleteProduct(int position);
    void updateProduct(int position, String todo);
}