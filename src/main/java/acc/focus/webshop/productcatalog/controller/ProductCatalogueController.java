package acc.focus.webshop.productcatalog.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductCatalogueController {

    @GetMapping(value = "/products")
    public String getProducts() {
        return "data";
    }
}
