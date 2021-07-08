package br.com.digitalhouse.apiecommerce.controller;

import br.com.digitalhouse.apiecommerce.model.Category;
import br.com.digitalhouse.apiecommerce.model.Database;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/category")
public class CategoryController {

    @RequestMapping("/list")
    public ArrayList<Category> listCategories(){
        Database db = new Database();
        ArrayList<Category> persistedCategories = db.getCategories();

       return persistedCategories;
    }


}
