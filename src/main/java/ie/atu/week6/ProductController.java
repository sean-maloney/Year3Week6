package ie.atu.week6;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    private ProductService myService;
    public ProductController(ProductService myService) {
        this.myService = myService;
    }

    private List<Product> list = new ArrayList<>();
    //Creating a class which is interested in requests and responses, Seperation of Concern


    @PostMapping("/add")
    public List<Product>  newProduct(@RequestBody Product product)
    {
        //send it to do business logic
        list = myService.addProduct(product);
        return list;
    }
    @PostMapping("/del/{id}")
    public List<Product>  removeProduct(@PathVariable int id)
    {
        //send it to do business logic
        list = myService.delProduct(id);
        return list;
    }
    @PutMapping("update/{id}")
    public List<Product> updateProduct(@PathVariable int id, @RequestBody Product product){
        list=myService.updateProduct(id,product);
        return list;
    }
}
