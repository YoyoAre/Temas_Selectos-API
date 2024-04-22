package com.proyecto_apis.t2;


import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
public class controladorhm {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello world \n pudin de chocolate";
    }
}
