package br.com.digitalhouse.apiecommerce.controller;

import br.com.digitalhouse.apiecommerce.model.Category;
import br.com.digitalhouse.apiecommerce.repository.CategoryRepository;
import io.swagger.annotations.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;


    @ApiOperation(
           value = "Listar Categorias Cadastradas",
           response = Category.class,
           notes = "Esta operação retorna a lista de categorias cadastradas"
    )
    @ApiResponses(value = {
           @ApiResponse(
                   code = 200,
                   message = "Retorna uma lista com informações das categorias cadastradas",
                   response = Category.class
           ),
           @ApiResponse(
                   code = 403,
                   message = "Token Não Autorizado"
           )
    })
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ArrayList<Category> listCategories(){
        ArrayList<Category> all = (ArrayList<Category>) categoryRepository.findAll();

        return all;
    }
    @ApiOperation(
            value = "Buscar categoria por ID")
    @RequestMapping(value = "/list/search", method = RequestMethod.GET)
    public Category listById(@RequestParam Integer id){
        Optional<Category> category = categoryRepository.findById(id);

        return category.get();
    }

    @ApiOperation(
            value = "Adicionar categoria")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addCategory(@RequestBody Category ct){
        categoryRepository.save(ct);
    }


}
