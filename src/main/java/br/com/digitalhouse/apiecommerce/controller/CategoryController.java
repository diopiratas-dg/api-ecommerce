package br.com.digitalhouse.apiecommerce.controller;

import br.com.digitalhouse.apiecommerce.model.Category;
import br.com.digitalhouse.apiecommerce.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Optional;

@RestController
@RequestMapping("/api/category")
public class CategoryController {

    @Autowired
    CategoryRepository categoryRepository;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ArrayList<Category> listCategories(){
        ArrayList<Category> all = (ArrayList<Category>) categoryRepository.findAll();

        return all;
    }

    @RequestMapping(value = "/list/search", method = RequestMethod.GET)
    public Category listById(@RequestParam Integer id){
        Optional<Category> category = categoryRepository.findById(id);

        return category.get();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public void addCategory(@RequestBody Category ct){
        categoryRepository.save(ct);
    }


}
