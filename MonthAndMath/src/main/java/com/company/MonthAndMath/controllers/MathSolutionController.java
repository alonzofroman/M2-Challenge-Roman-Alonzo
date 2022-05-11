package com.company.MonthAndMath.controllers;

import com.company.MonthAndMath.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class MathSolutionController {

//    private static MathSolution mathObject = new MathSolution();

//    @RequestMapping(value="/add", method= RequestMethod.POST)
//    @ResponseBody
    @PostMapping(value="/add")
    public MathSolution getAddSolution(@RequestBody MathSolution mathSolution) {

//        MathSolution mathObject = new MathSolution(operand1, operand2);
//         mathObject.add();
//         return mathObject;
        return mathSolution;

    }
}
