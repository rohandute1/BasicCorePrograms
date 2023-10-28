package com.bridgelabz.functionalprograms;

import java.util.Scanner;

public class FunctionalPrograms {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input the number of rows and columns
        System.out.print("Enter the number of rows (M): ");
        int m = sc.nextInt();
        System.out.print("Enter the number of columns (N): ");
        int n = sc.nextInt();

        // Create a 2D array to store the input
        Object[][] array2D = new Object[m][n];

        // Input values for the 2D array
        System.out.println("Enter " + (m * n) + " elements for the 2D array:");

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (sc.hasNextInt()) {
                    array2D[i][j] = sc.nextInt();
                } else if (sc.hasNextDouble()) {
                    array2D[i][j] = sc.nextDouble();
                } else if (sc.hasNextBoolean()) {
                    array2D[i][j] = sc.nextBoolean();
                } else {
                    System.out.println("Invalid input. Please enter integers, doubles, or booleans.");
                    return;
                }
            }
        }

        // Print the 2D array directly to System.out
        System.out.println("2D Array:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
