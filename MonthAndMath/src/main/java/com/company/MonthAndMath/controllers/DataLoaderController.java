package com.company.MonthAndMath.controllers;


import com.company.MonthAndMath.repository.MathRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DataLoaderController {

    @Autowired
    MathRepository repo;
}
