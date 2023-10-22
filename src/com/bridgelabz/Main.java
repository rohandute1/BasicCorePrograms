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
                "4.Harmonic Numbers");

        int option = sc.nextInt();
        switch(option){
            case 1:
                Main.coinFlipper();
                break;
            case 2:
                Main.leapYearChecker();
                break;
            case 3:
                Main.powerOf2();
                break;
            case 4:
                Main.harmonicNumberPrinter();
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
}