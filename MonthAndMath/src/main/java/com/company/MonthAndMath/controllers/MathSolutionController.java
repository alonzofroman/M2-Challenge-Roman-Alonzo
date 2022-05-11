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

    @PostMapping(value="/subtract")
    public MathSolution getSubtractSolution(@RequestBody MathSolution mathSolution) {
        mathSolution.subtract();
        return mathSolution;
    }

    @PostMapping(value="/multiply")
    public MathSolution getMultiplySolution(@RequestBody MathSolution mathSolution) {
        mathSolution.multiply();
        return mathSolution;
    }

    @PostMapping(value="/divide")
    public MathSolution getDivideSolution(@RequestBody MathSolution mathSolution) {
        mathSolution.divide();
        return mathSolution;
    }
}
