package com.Example;

import java.util.Scanner;

public class Test {
    public String test(){
        String answer="please try again";
        System.out.println("what function would you like?" +
                "\n" +
                "1: Addition" +
                "\n" +
                "2: subtraction" +
                "\n" +
                "3: multiplication" +
                "\n" +
                "4: division");
        Scanner input = new Scanner(System.in);

        String Choice = input.next().toLowerCase();

        System.out.println("Enter your first number");
        double a = input.nextDouble();

        System.out.println("Enter your next number");
        double b = input.nextDouble();

        if (Choice == "addition"){
            Choice = "1";
        } else if (Choice == "subtraction") {
            Choice = "2";
        } else if (Choice == "multiplication") {
            Choice = "3";
        }else if (Choice == "division") {
            Choice = "4";
        }

        switch (Choice){
            case "1":
                answer= String.valueOf(Calculator.add(a,b));
                break;
            case "2":
                answer= String.valueOf(Calculator.subtract(a,b));
                break;
            case "3":
                answer= String.valueOf(Calculator.multiply(a,b));
                break;
            case "4":
                answer= String.valueOf(Calculator.divide(a,b));
                break;
            default:
                answer="please try again";
        }
        return answer;
    }
}
