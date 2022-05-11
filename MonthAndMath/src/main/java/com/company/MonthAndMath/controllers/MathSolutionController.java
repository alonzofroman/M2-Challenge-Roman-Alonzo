package com.company.MonthAndMath.controllers;

import com.company.MonthAndMath.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathSolutionController {


    @PostMapping(value="/add")
    public MathSolution getAddSolution(@RequestBody MathSolution mathSolution) {
            mathSolution.add();
        return mathSolution;

    }
}
