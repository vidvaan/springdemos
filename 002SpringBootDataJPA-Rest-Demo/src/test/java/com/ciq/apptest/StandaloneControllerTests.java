package com.ciq.apptest;

import static org.mockito.ArgumentMatchers.any;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.put;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.Arrays;
import java.util.List;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

import com.ciq.controller.ProductController;
import com.ciq.entity.Product;
import com.ciq.service.ProductService;

@WebMvcTest(ProductController.class)
public class StandaloneControllerTests {

  @MockBean
  ProductService productService;

  @Autowired
  MockMvc mockMvc;

  @Test
  public void testfindAll() throws Exception {
    Product product1 = new Product(1, "TV2", 200000.00);
    Product product2 = new Product(2, "Laptop", 200000.00);
    Product product3 = new Product(3, "Mobile", 200000.00);
    List<Product> products = Arrays.asList(product1,product2,product3);

    Mockito.when(productService.findAll()).thenReturn(products);

    mockMvc.perform(get("/products"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result", Matchers.hasSize(3)))
        .andExpect(jsonPath("$.result[0].pname", Matchers.equalTo("TV2")))
        .andDo(MockMvcResultHandlers.print());
  }
  
  
  @Test
  public void testfindById() throws Exception {
    Product product = new Product(1, "TV2", 200000.00);

    Mockito.when(productService.findById(1)).thenReturn(product);

    mockMvc.perform(get("/products/1"))
        .andExpect(status().isOk())
        .andExpect(jsonPath("$.result.pname", Matchers.equalTo("TV2")))
        .andExpect(jsonPath("$.result.pcost", Matchers.equalTo(200000.00)))
        .andDo(MockMvcResultHandlers.print());
  }
  
  
  @Test
  public void testSave() throws Exception{
	  String productJson = "{\"pname\": \"Samsung TV\", \"pcost\": 100000.0}";
	  
	  Mockito.when(productService.save(any(Product.class))).thenReturn(new Product(1, "Samsung TV", 100000.0));
	  
	  mockMvc.perform(post("/products")
              .contentType(MediaType.APPLICATION_JSON)
              .content(productJson))
              .andExpect(status().isOk())
              .andExpect(jsonPath("$.result.pid").value(1))
              .andExpect(jsonPath("$.result.pname").value("Samsung TV"))
              .andExpect(jsonPath("$.result.pcost").value(100000.0))
              .andDo(MockMvcResultHandlers.print());
  }
  
  
  @Test
  public void testUpdate() throws Exception{
	  String productJson = "{\"pid\": 1,\"pname\": \"Samsung TV New\", \"pcost\": 100000.0}";
	  
	  
	  mockMvc.perform(put("/products")
              .contentType(MediaType.APPLICATION_JSON)
              .content(productJson))
              .andExpect(status().isOk())
              .andExpect(jsonPath("$.result").value("Updated Successflly"))
              .andDo(MockMvcResultHandlers.print());
  }
  
  @Test
  public void testDelete() throws Exception{
	  mockMvc.perform(delete("/products/1"))
              .andExpect(status().isOk())
              .andExpect(jsonPath("$.result").value("Deleted Successflly"))
              .andDo(MockMvcResultHandlers.print());
  }

}


 
