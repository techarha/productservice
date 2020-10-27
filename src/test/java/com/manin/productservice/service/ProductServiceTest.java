package com.manin.productservice.service;

import com.manin.productservice.model.Product;
import com.manin.productservice.repository.ProductRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@RunWith(SpringJUnit4ClassRunner.class)
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetAllProductsFromRepo() {
        when(productRepository.findAll()).thenReturn(Collections.emptyList());
        List<Product> products = productService.getAllProducts();
        assertThat(products.size()).isEqualTo(0);
    }

    @Test
    public void testGetProductByIdFromRepo() {
        Product product = new Product();
        product.setBrand("Probee");
        when(productRepository.findById(any())).thenReturn(Optional.of(product));
        Optional<Product> optionalProduct = productService.getProductId(any());
        assertThat(optionalProduct.get().getBrand()).isEqualTo("Probee");
    }

    @Test
    public void testSaveProductToRepo() {
        Product product = new Product();
        product.setBrand("Probee");
        when(productRepository.save(product)).thenReturn(product);
        Product savedProduct = productService.saveProduct(product);
        assertThat(savedProduct.getBrand()).isEqualTo("Probee");
    }
}