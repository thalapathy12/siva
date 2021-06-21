package com.example.siva.controller;

import com.example.siva.entity.DemoEntity;
import com.example.siva.repo.DemoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.awt.print.Book;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class DemoController {

    @Autowired
    DemoRepo demoRepo;



    @RequestMapping("/update")
    public DemoEntity update(@RequestBody DemoEntity demoEntity){

        demoRepo.save(demoEntity);
        return demoEntity;
    }
}