package com.company.MonthAndMath.controllers;

import com.company.MonthAndMath.models.MathSolution;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.ValidationException;

@RestController
public class MathSolutionController {


    @PostMapping(value="/add")
    public MathSolution getAddSolution(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new IllegalArgumentException("operand1 and operand2 cannot be null");
        }
        mathSolution.add();
        return mathSolution;
    }

    @PostMapping(value="/subtract")
    public MathSolution getSubtractSolution(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new IllegalArgumentException("Operand1 and operand2 cannot be null");
        }
        mathSolution.subtract();
        return mathSolution;
    }

    @PostMapping(value="/multiply")
    public MathSolution getMultiplySolution(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new IllegalArgumentException("Operand1 and operand2 cannot be null");
        }
        mathSolution.multiply();
        return mathSolution;
    }

    @PostMapping(value="/divide")
    public MathSolution getDivideSolution(@RequestBody MathSolution mathSolution) {
        if (mathSolution.getOperand1() == null || mathSolution.getOperand2() == null) {
            throw new IllegalArgumentException("Operand1 and operand2 cannot be null");
        }
        if (mathSolution.getOperand2() == 0) {
            throw new IllegalArgumentException("You cannot divide by zero");
        }
        mathSolution.divide();
        return mathSolution;
    }
}
