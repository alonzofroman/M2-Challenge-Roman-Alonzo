package com.company.MonthAndMath.models;

import java.util.Objects;

public class Math {
    private Integer operand1;
    private Integer operand2;
    private String operation;
    private Integer answer;

    public Math(Integer operand1, Integer operand2, String operation, Integer answer) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.operation = operation;
        this.answer = answer;
    }

    public Math() {
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

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Integer getAnswer() {
        return answer;
    }

    public void setAnswer(Integer answer) {
        this.answer = answer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Math math = (Math) o;
        return Objects.equals(operand1, math.operand1) && Objects.equals(operand2, math.operand2) && Objects.equals(operation, math.operation) && Objects.equals(answer, math.answer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(operand1, operand2, operation, answer);
    }
}
