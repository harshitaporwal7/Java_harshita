package com.harshita;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in =  new Scanner(System.in);
        int res = 0;
        while(true){
            System.out.println("Enter Operator: ");
            char oprat = in.nextLine().trim().charAt(0);

            if(oprat == '+' || oprat == '-' || oprat == '*' || oprat == '/' || oprat == '%') {
                System.out.println("enter two numbers: ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();
                if(oprat == '+') {
                    res = num1+num2;
                }if(oprat == '-'){
                    res = num1 - num2;
                }if(oprat == '*') {
                    res = num1 * num2;
                }if(oprat == '/'){
                    if(num2 != 0) {
                        res = num1 / num2;
                    }
                }if (oprat == '%'){
                    if(num2 != 0) {
                        res = num1 % num2;
                    }
                }else if(oprat == 'X' || oprat ==  'x'){
                    break;
                }else{
                    System.out.println("Invalid Operator");
                }
            }
            System.out.println("The result is: " + res);
        }
    }
}
