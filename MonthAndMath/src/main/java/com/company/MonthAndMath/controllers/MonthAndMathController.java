package com.company.MonthAndMath.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MathController {

    @Autowired
    MathApplication repo;

    @RequestMapping(value="/add")

}
