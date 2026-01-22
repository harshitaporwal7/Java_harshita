package com.harshita;

import java.util.Scanner;

public class learn{
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
//            String greet = greetings();
//        System.out.println(greet);
        //sum();
        int x =  in.nextInt();
        int y =  in.nextInt();
        int result = Swap(x,y);
        System.out.println(x +" "+ y);
    }

    static String greetings(){
        System.out.println("Hello World");
        String greetings = "here i am ";
        return greetings;
    }

    static int sum() {
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sums = num1 + num2;
        System.out.println(sums);
        return sums;
    }

    static int Swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        return a;
    }


}