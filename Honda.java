Honda com.example.demo;

import com.example.demo.Car;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class HondaController {
    @GetMapping("/product")
    public List<Product> getProducts() {
        // Creating dummy products for testing
        List<Product> products = new ArrayList<>();
        products.add(new Car(1L, "Honda", 799.99));
        products.add(new Car(2L, "Civic", 699.99));

        return products;
    }
}
