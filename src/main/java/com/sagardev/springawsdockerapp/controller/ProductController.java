package com.sagardev.springawsdockerapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ProductController {

    @GetMapping("/posts")
    List<String> getPosts(){
        return Arrays.asList("apple","ball");
    }

}
