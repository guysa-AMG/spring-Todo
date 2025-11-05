package com.logger.todo;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;


@RestController
@RequestScope
public class CustomerController {
    
    CustomersService cs;

    public CustomerController(CustomersService cis){this.cs=cis;};


    @GetMapping("/users")
    public List<Customers> getUser(  ) {
        return cs.getAll();
    }
    
}
