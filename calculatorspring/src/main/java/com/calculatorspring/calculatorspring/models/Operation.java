package com.calculatorspring.calculatorspring.models;

import org.springframework.stereotype.Component;

@Component
public class Operation {
    private int operand1;
    private int operand2;
    private String symbol;

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

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }
}


