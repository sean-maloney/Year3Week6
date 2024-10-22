package ie.atu.week6;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class ProductService {
    private List<Product> myList = new ArrayList<>();
    public List<Product> addProduct(Product product)
    {
        //Do business stuff like retrieving details from db, or generating files pdfs
        myList.add(product);
        return myList;
    }
    /*public List<Product> delProduct(Product product)
    {
        for (Product p : myList) {//once function is called, it runs the code
            if (p.getId().equals(id)) {
                myList.remove(p);//removes product
            }
        }
    return myList;
    }*/
    public List<Product> updateProduct(int id, Product product){
        for(Product p : myList){
            if(p.getId() == id){
                myList.remove(p);
            }
        }
        myList.add(product);
        return myList;
    }

}
