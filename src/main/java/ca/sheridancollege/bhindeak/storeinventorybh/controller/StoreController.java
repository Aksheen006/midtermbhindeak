package ca.sheridancollege.bhindeak.storeinventorybh.controller;

import ca.sheridancollege.bhindeak.storeinventorybh.model.Product;
import ca.sheridancollege.bhindeak.storeinventorybh.model.Store;
import ca.sheridancollege.bhindeak.storeinventorybh.repository.ProductRepository;
import ca.sheridancollege.bhindeak.storeinventorybh.repository.StoreRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StoreController {

    private final StoreRepository storeRepository;
    private final ProductRepository productRepository;

    public StoreController(StoreRepository storeRepository, ProductRepository productRepository) {
        this.storeRepository = storeRepository;
        this.productRepository = productRepository;
    }

    @GetMapping("/")
    public String index(Model model) {
        List<Store> stores = storeRepository.findAll();
        List<Product> products = productRepository.findAll();
        model.addAttribute("stores", stores);
        model.addAttribute("products", products);
        return "index";
    }
}
