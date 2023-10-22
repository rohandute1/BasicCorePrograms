package com.bridgelabz;

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome to Basic Core Programs.");
        System.out.println("Please select program from following:");
        System.out.println("1.Calculate % of heads and tails");

        int option = sc.nextInt();
        switch(option){
            case 1:
                Main.coinFlipper();
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

}