package Controller;

import Interfaces.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/products")
public class StockController {

    @Autowired
    StockService stockService;

    @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody List<String> GetProducts(){
        return stockService.listProducts();
    }

    @RequestMapping(value = "{position}", method = RequestMethod.GET)
    public @ResponseBody String GetProduct(@PathVariable int position){
        return stockService.getProduct(position);
    }

    @RequestMapping(method = RequestMethod.POST)
    public @ResponseBody String AddProduct(@RequestBody String product){
        return stockService.addProduct(product);
    }

    @RequestMapping(value = "{position}", method = RequestMethod.PUT)
    public @ResponseBody void UpdateProduct(@PathVariable int position, @RequestBody String product){
	stockService.addProduct(product);
    }

    @RequestMapping(value = "{position}", method = RequestMethod.DELETE)
    public @ResponseBody void DeleteProduct(@PathVariable int position){
	stockService.deleteProduct(position);
    }
}