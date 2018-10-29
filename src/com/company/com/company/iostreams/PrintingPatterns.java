package com.company.com.company.iostreams;

import java.util.Scanner;

public class PrintingPatterns {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number of rows to print: ");
        int number = input.nextInt();

        input.close();

        patternTriangle1(number);
        //patternTriangle2(number);
        patternTriangle3(number);
    }

    private static void patternTriangle1(int x) {
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void patternTriangle2(int x) {
        for(int i = 1; i <= x; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        for(int i = x - 1; x >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    private static void patternTriangle3(int x) {
        for(int i = 1; i <= x; i++){
            for(int j = x; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
        for(int i = x; i >= 1; i--){
            if(i == x)continue;

            for(int j = x; j >= i; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
