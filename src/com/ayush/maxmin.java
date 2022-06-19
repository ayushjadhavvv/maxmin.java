package com.ayush;

import java.util.Scanner;

public class maxmin {

    public static void main(String[] args) {
        // Inputs
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");

        int n = sc.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");

        for(int i = 0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        //main part of the program
        int max,min;
        if(n == 1) {
            max = arr[0];
            min = arr[0];
        }else{
            if(arr[0] > arr[1]) {
                max = arr[0];
                min = arr[1];
            }else{
                max = arr[1];
                min = arr[0];
            }
            for(int i = 2; i<n; i++) {
                if(arr[i] > max) {
                    max = arr[i];
                }
                if(arr[i] < min) {
                    min = arr[i];
                }
            }
            System.out.println("The maximum element is"+ " " + max);
            System.out.println("The minimum element is"+ " " + min);
        }
    }
}
