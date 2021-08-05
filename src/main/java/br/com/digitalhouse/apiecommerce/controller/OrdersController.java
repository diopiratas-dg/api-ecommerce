package br.com.digitalhouse.apiecommerce.controller;

import br.com.digitalhouse.apiecommerce.model.Orders;
import br.com.digitalhouse.apiecommerce.repository.OrdersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

    @Autowired
    OrdersRepository repo;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    public ArrayList<Orders> list(){
        return (ArrayList<Orders>) repo.findAll();
    }
}
