package com.example.introductiontospringboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController

public class welcomeController {


    @GetMapping("/name")
    public String name() {
        return "My name is Sara";
    }

    @GetMapping("/age")
    public String age(){
        return "My age is 23";
    }

    @GetMapping("/check/status")
    public String checkStatus(){
        return "Everything OK";
    }
    @GetMapping("/health")
    public String health(){
        return "Server health is up and running";
    }

    ArrayList<String> names = new ArrayList<>();


    @GetMapping("/names")
    public ArrayList<String> names() {
        names.add("Sara");
        names.add("Nora");
        names.add("Alaa");
        return names;
    }


}

