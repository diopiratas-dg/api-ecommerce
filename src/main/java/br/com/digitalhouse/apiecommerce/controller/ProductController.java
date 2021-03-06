package br.com.digitalhouse.apiecommerce.controller;

import br.com.digitalhouse.apiecommerce.model.Product;
import br.com.digitalhouse.apiecommerce.repository.ProductRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/product")
public class ProductController implements Serializable {

    @Autowired
    ProductRepository repoProd;

    @ApiOperation(
            value = "Buscar todos produtos")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ArrayList<Product> listAllProducts(){
        return (ArrayList<Product>) repoProd.findAll();
    }

    @ApiOperation(
            value = "Buscar produto por id do produto")
    @RequestMapping(value = "/list/search", method = RequestMethod.GET)
    public Product listByIdProduct(@RequestParam Integer id){
        Optional<Product> product = repoProd.findById(id);

        return product.get();
    }

    @ApiOperation(
            value = "Adicionar produto")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addProduct(@RequestBody Product prd){
        repoProd.save(prd);
    }

}
