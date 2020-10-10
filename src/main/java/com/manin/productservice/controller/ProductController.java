package com.manin.productservice.controller;

import com.manin.productservice.model.Product;
import com.manin.productservice.service.ProductService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Optional;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@Controller
public class ProductController {
    public static final String PRODUCT_URl = "/product";
    public static final String PRODUCT_URL_ID = "/product/{id}";
    private ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @ApiOperation("Get all Products")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Retrieves products", response = Product.class)
    })
    @GetMapping(path=PRODUCT_URl, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @ApiOperation("Get Product by id")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Retrieves product by Id", response = Product.class)
    })
    @GetMapping(path=PRODUCT_URL_ID, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Optional<Product> getProductById(@PathVariable String id) {
        return productService.getProductId(id);
    }

    @ApiOperation("Persist product to Db")
    @ApiResponses({
            @ApiResponse(code = 200, message = "Retrieves product by Id", response = Product.class)
    })
    @PostMapping(path=PRODUCT_URl, produces = APPLICATION_JSON_VALUE)
    @ResponseBody
    public Product saveProduct(Product product) {
        return productService.saveProduct(product);
    }
}