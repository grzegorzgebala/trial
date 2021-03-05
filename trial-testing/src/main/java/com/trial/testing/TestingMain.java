package com.trial.testing;

import com.trial.testing.calculator.Calculator;
import com.trial.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        SimpleUser simpleUser = new SimpleUser("theForumUser");

        String result = simpleUser.getUsername();

        if (result.equals("theForumUser")){
            System.out.println("test OK");
        } else {
            System.out.println("Error!");
        }

        Calculator calculator = new Calculator();

        int resultCalculatorAdd = calculator.add(2, 3);
        int resultCalculatorSubtract = calculator.subtract(3, 2);

        if (resultCalculatorAdd == 5){
            System.out.println("Dodawanie - test OK");
        } else {
            System.out.println("Dodawanie - Error!");
        }

        if (resultCalculatorSubtract == 1){
            System.out.println("Odejmowanie - test OK");
        } else {
            System.out.println("Odejmowanie - Error!");
        }
    }
}
