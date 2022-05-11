package com.company.MonthAndMath.models;

public class MathSolution {
    private int operand1;
    private int operand2;

    private int answer;
    private String operation;

    public MathSolution(int operand1, int operand2) {
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public MathSolution(int operand1, int operand2, int answer, String operation) {
        this.operand1 = operand1;
        this.operand2 = operand2;
        this.answer = answer;
        this.operation = operation;
    }

    public int getOperand1() {
        return operand1;
    }

    public void setOperand1(int operand1) {
        this.operand1 = operand1;
    }

    public int getOperand2() {
        return operand2;
    }

    public void setOperand2(int operand2) {
        this.operand2 = operand2;
    }

    public int getAnswer() {
        return answer;
    }

    public void setAnswer(int answer) {
        this.answer = answer;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }



    public MathSolution() {
    }

    //    Methods
//    public void add(int operand1, int operand2, String operation) {
//        this.setOperation(operation);
//        if (this.operation == "add") {
//            int sum = operand1 + operand2;
//            this.setOperand1(operand1);
//            this.setOperand2(operand2);
//            this.setAnswer(sum);
//        }
//    }
//
    public void add() {
        this.operation = "add";
            int sum = operand1 + operand2;
            this.answer = sum;
    }



    public static int subtract(Integer operand1, Integer operand2) {
        int answer = operand1 - operand2;
        return answer;
    }

    public static int multiply(Integer operand1, Integer operand2) {
        int answer = operand1 * operand2;
        return answer;
    }

    public static int divide(Integer operand1, Integer operand2) {
        int answer = operand1 / operand2;
        return answer;
    }
}
