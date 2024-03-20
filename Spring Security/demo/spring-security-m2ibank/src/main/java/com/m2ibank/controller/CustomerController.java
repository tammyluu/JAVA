package com.m2ibank.controller;

import com.m2ibank.model.Customer;
import com.m2ibank.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("auth/register")
    public boolean registerCustomer(@RequestBody Customer newCustomer){
       return customerService.createUser(newCustomer);
    }


}
