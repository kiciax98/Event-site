package com.praca.inzynierka.controller;

import com.praca.inzynierka.entity.Student;
import com.praca.inzynierka.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

//@CrossOrigin("*")
@RestController
public class UserController {

    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //@GetMapping
    //public UserDetails register(//@RequestBody Student)
}
