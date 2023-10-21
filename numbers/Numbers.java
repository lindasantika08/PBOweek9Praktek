/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.numbers;

/**
 *
 * @author LINDA
 */

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Integer[] intList; // Menggunakan Integer[] sebagai gantinya
        int size;

        Scanner scan = new Scanner(System.in);

        System.out.print("\nHow many integers do you want to sort? ");
        size = scan.nextInt();
        intList = new Integer[size]; // Menggunakan Integer[]

        System.out.println("\nEnter the numbers...");
        for (int i = 0; i < size; i++)
            intList[i] = scan.nextInt();

        Sorting.selectionSort(intList); // Menggunakan Integer[]

        System.out.println("\nYour numbers in sorted order...");
        for (int i = 0; i < size; i++)
            System.out.print(intList[i] + "  ");
        System.out.println();
    }
}




