package com.bridgelabz;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Basic Core Programs.");
        System.out.println("Please select program from following:");
        System.out.println("1.Calculate % of heads and tails\n" +
                "2.Leap year checker\n");

        int option = sc.nextInt();
        switch(option){
            case 1:
                Main.coinFlipper();
                break;
            case 2:
                Main.leapYearChecker();
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

}