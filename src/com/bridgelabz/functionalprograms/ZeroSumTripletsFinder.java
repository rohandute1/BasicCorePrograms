package com.bridgelabz.functionalprograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ZeroSumTripletsFinder {
    public static void main(String[] args) {
        int[] array = {1, -2, 1, 0, 5, -1, -1, 2, -3};
        findTripletsWithSumZero(array);
    }

    public static void findTripletsWithSumZero(int[] arr) {
        Arrays.sort(arr); // Sort the input array to easily find triplets

        int n = arr.length;
        List<List<Integer>> tripletsList = new ArrayList<>();

        for (int i = 0; i < n - 2; i++) {
            if (i == 0 || (i > 0 && arr[i] != arr[i - 1])) {
                int left = i + 1;
                int right = n - 1;
                int targetSum = -arr[i];

                while (left < right) {
                    if (arr[left] + arr[right] == targetSum) {
                        tripletsList.add(Arrays.asList(arr[i], arr[left], arr[right]));

                        // Skip duplicates
                        while (left < right && arr[left] == arr[left + 1]) left++;
                        while (left < right && arr[right] == arr[right - 1]) right--;

                        left++;
                        right--;
                    } else if (arr[left] + arr[right] < targetSum) {
                        left++;
                    } else {
                        right--;
                    }
                }
            }
        }

        System.out.println("Distinct triplets with sum zero:");
        for (List<Integer> triplet : tripletsList) {
            System.out.println(triplet);
        }

        System.out.println("Total distinct triplets: " + tripletsList.size());
    }
}
