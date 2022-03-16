package com.calculatorspring.calculatorspring.services;

import com.calculatorspring.calculatorspring.models.Operation;
import org.springframework.stereotype.Service;

@Service
public class OperationService {
    public int Calculate(Operation operation){

        int operator1 = operation.getOperand1();
        int operator2 = operation.getOperand2();
        int result = 0;

        switch (operation.getSymbol()){
            case "+":
                result = operator1 + operator2;
                break;

            case "-":
                result = operator1 - operator2;
                break;

            case "*":
                result = operator1*operator2;
                break;

            case "/":
                result = operator1/operator2;

        }

        return result;

    }
}
