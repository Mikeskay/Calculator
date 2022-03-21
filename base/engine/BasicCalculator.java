package calculator.base.engine;

import java.util.Scanner;
import java.lang.Math;

public class BasicCalculator {


    public static double calculation(char operator, double num1, double num2){

    double cal = 0;
       

    if (operator == '+' || operator == '-' ||operator == '*' ||operator == '/' || operator == '^'){

     
            switch (operator) {
                case '+':
                    return cal = num1 + num2;
                
                case '-':
                    return cal = num1 - num2;
                
                case '*':
                    return cal = num1 * num2;
                
                case '/':
                    return cal = num1 / num2;   
                case '^':
                    return Math.pow(num1, num2);       
            }
            return cal;
    
    }
    else {
        
        throw new IllegalStateException("Invalid Operator");
    }
            
    }

    
}
