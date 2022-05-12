package com.company.MonthAndMath.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class MathSolution {
    private Integer operand1;
    private Integer operand2;
    private Integer answer;
    private String operation;

    public MathSolution() {
    }

    public MathSolution(Integer operand1) {
        this.operand1 = operand1;
    }
    public MathSolution(Integer operand1, Integer operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public MathSolution(Integer operand1, Integer operand2, Integer answer, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.answer = answer;
        this.operation = operation;
    }

    public Integer getOperand1() {
        return operand1;
    }

    public void setOperand1(Integer operand1) {
        this.operand1 = operand1;
    }

    public Integer getOperand2() {
        return operand2;
    }

    public void setOperand2(Integer operand2) {
        this.operand2 = operand2;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }



//Methods

    public void add() {
        this.operation = "add";
        Integer sum = operand1 + operand2;
            this.answer = sum;
    }

    public void subtract() {
        this.operation = "subtract";
        Integer difference = operand1 - operand2;
        this.answer = difference;
    }

    public void multiply() {
        this.operation = "multiply";
        Integer product = operand1 * operand2;
        this.answer = product;
    }

    public void divide() {
        this.operation = "divide";
        Integer quotient = operand1 / operand2;
        this.answer = quotient;
    }


}
