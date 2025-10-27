package com.practice_harshita;

import java.util.Scanner;

public class basic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
     //Write a program to print whether a number is even or odd, also take input from the user.
//        int num = in.nextInt();
//        if(num % 2 == 0) {
//            System.out.println("your number is even : "+ num);
//        }else {
//            System.out.println("your number is odd : "+ num);
//        }

       //Take name as input and print a greeting message for that particular name.
//        String name = in.next();
//        System.out.println("Hello dear" + " " + name);

     //Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest
//        int Principal = in.nextInt();
////        int Rate = in.nextInt();
////        int Time = in.nextInt();
////        int SI = (Principal*Rate*Time)/100;
////        System.out.println(SI);

       //Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
//        char oprat = in.next().charAt(0);
//        int ans=0;
//        if(oprat== '+' || oprat == '-' || oprat == '/' || oprat == '*'){
//            int a = in.nextInt();
//            int b = in.nextInt();
//            if(oprat == '+'){
//                System.out.println(a+b);
//            }if(oprat == '-'){
//                System.out.println(a-b);
//            }if(oprat == '/'){
//                if(a%b==0) {
//                    System.out.println(a / b);
//                }
//            }if(oprat == '*'){
//                System.out.println(a*b);
//            }
//            System.out.println(ans);
//        }


        //Take 2 numbers as input and print the largest number.
//        int x = in.nextInt();
//        int y = in.nextInt();
//        if(x>y){
//            System.out.println(x);
//        }else{
//            System.out.println(y);
//        }

        //Input currency in rupees and output in USD.
//        int currency = in.nextInt();
//        int USD = currency/83;
//        System.out.println("rupees in us dollar is: "+ USD);

        //To calculate Fibonacci Series up to n numbers.
//        int n = in.nextInt();
//        int a = 0;
//        int b = 1;
//        int count = 2;
//        while(count <= n) {
//            int temp = b;
//            b =  a+b;
//            a = temp;
//            count++;
//        }
//        System.out.println(b);

        //To find out whether the given String is Palindrome or not.
        int num = in.next().charAt(0);
        int f_num = num;
        while(f_num >= 10){
            f_num/=10;
        }
          System.out.println("first num : "+f_num);
//        int l_num=0;
//        while(num % 10==0){
//            num/=10;
//        }
//        System.out.println("last num : "+l_num);
//        if(f_num == l_num){
//            System.out.println(num+ "- is a palindrome number");
//        }


    }

}
