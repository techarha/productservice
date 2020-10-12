package com.manin.productservice.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.manin.productservice.model.Product;
import com.manin.productservice.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import java.util.Collections;
import java.util.Optional;

import static com.manin.productservice.controller.ProductController.PRODUCT_URL;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(ProductController.class)
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    ObjectMapper mapper = new ObjectMapper();


    @Test
    public void testGetAllProducts() throws Exception {
        when(productService.getAllProducts()).thenReturn(Collections.emptyList());
        mockMvc.perform(MockMvcRequestBuilders.get(PRODUCT_URL)
                .contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetProductById() throws Exception {
        when(productService.getProductId(anyString())).thenReturn(Optional.empty());
        // TODO: use constant
        mockMvc.perform(MockMvcRequestBuilders.get("/product/2")
                .contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }

    @Test
    public void testPostProduct() throws Exception {
        Product product = new Product();
        product.setBrand("Probee");
        when(productService.saveProduct(any(Product.class))).thenReturn(any(Product.class));
        // TODO: find a better way without mapper.
        mockMvc.perform(MockMvcRequestBuilders.post(PRODUCT_URL)
                .content(mapper.writeValueAsString(product))
                .contentType(APPLICATION_JSON_VALUE))
                .andExpect(status().isOk());
    }
}