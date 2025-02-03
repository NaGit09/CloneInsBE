package org.example.cloneins.Controller;

import org.example.cloneins.Model.Product;
import org.example.cloneins.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = {"/Product"})
@SpringBootApplication
public class ProductController {
    // DI
    @Autowired
    private ProductRepository productRepository;

    @GetMapping("")
    public List<Product> getAllProduct () {
        return productRepository.findAll() ;
    }
}

