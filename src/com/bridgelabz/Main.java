package com.bridgelabz;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Basic Core Programs.");
        System.out.println("Please select program from following:");
        System.out.println("1.Calculate % of heads and tails\n" +
                "2.Leap year checker\n" +
                "3.Power of 2\n" +
                "4.Harmonic Numbers\n" +
                "5.Prime factorization\n" +
                "6.Compute Quotient and Remainder\n" +
                "7.Program to Swap Two Numbers");

        int option = sc.nextInt();
        switch(option){
            case 1:
                coinFlipper();
                break;
            case 2:
                leapYearChecker();
                break;
            case 3:
                powerOf2();
                break;
            case 4:
                harmonicNumberPrinter();
                break;
            case 5:
                primeFactorization();
                break;
            case 6:
                QuotientAndRemainderCalculator();
                break;
            case 7:
                numberSwapper();
                break;
        }
    }
    public static void coinFlipper(){

        int countTails = 0;
        int countHeads = 0;
        for(int i = 1;i<=100;i++){
            double toss = (Math.random());
            if(toss<=0.5){
                countTails++;
            }else {
                countHeads++;
            }
        }
        double percentageOfTails = (countTails /100.0)*100;
        double percentageOfHeads = (countHeads /100.0)*100;

        System.out.println("Percentage of heads : " + percentageOfHeads);
        System.out.println("Percentage of tails : " + percentageOfTails);
    }
    public static void leapYearChecker(){
        System.out.println("Please enter any year you want to check.");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println("Year entered is a leap year");
        }else{
            System.out.println("Year entered is not a leap year");
        }
    }
    public static void powerOf2(){
        System.out.println("Enter a value for N (0 <= N < 31):");
        int N = sc.nextInt();
        sc.close();

        if (N >= 0 && N < 31) {
            int powerOf2 = 1;
            for (int i = 0; i <= N; i++) {
                System.out.println("2^" + i + " = " + powerOf2);
                powerOf2 *= 2;
            }
        } else {
            System.out.println("Input is out of range. Please enter a value between 0 and 30.");
        }
    }
    public static void harmonicNumberPrinter(){
        System.out.println("Please enter number up to which wants to check harmonic number:");
        int number = sc.nextInt();
        double harmonicNum = 0;
        for (int i =  1; i<=number; i++){

            harmonicNum = harmonicNum+(double)1/i;
        }
        System.out.println(harmonicNum);
    }
    public static void primeFactorization(){
        System.out.print("Enter a number to find its prime factors: ");
        int N = sc.nextInt();
        System.out.print("Prime factors of " + N + " are: ");
        while (N % 2 == 0) {
            System.out.print(2 + " ");
            N = N / 2;
        }

        for (int i = 3; i * i <= N; i += 2) {
            while (N % i == 0) {
                System.out.print(i + " ");
                N = N / i;
            }
        }

        if (N > 2) {
            System.out.print(N);
        }
    }
    public static void QuotientAndRemainderCalculator(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

    }
    public static void numberSwapper(){

        System.out.print("Enter the first number: ");
        int firstNumber = sc.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = sc.nextInt();

        System.out.println("Original values: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);

        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("Swapped values: ");
        System.out.println("First number: " + firstNumber);
        System.out.println("Second number: " + secondNumber);
    }
}