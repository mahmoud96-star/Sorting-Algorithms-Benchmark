/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sortingalgorithms;

import java.util.Random;
import java.util.Arrays;


public class Sortingalgorithms {
    
    static int[] Randomarr(int n) {
    int[] arr = new int[n];
    Random random = new Random();

    for (int i = 0; i < n; i++) {
        arr[i] = random.nextInt(999999) + 1;
    }

    return arr;
    }

    static int[] ReverseSortedarr(int n) {
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = n - i;
    }

    return arr;
    }

    static int[] FullySortedarr(int n) {
    int[] arr = new int[n];

    for (int i = 0; i < n; i++) {
        arr[i] = i + 1;
    }

    return arr;
    }

    static int[] PartiallySortedarr(int n) {
    int[] arr = FullySortedarr(n);
    Random random = new Random();

    // Shuffle about 20% of the elements
    int swaps = n / 10;

    for (int i = 0; i < swaps; i++) {
        int a = random.nextInt(n);
        int b = random.nextInt(n);

        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    return arr;
    }

     static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
     
      static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;
        }
    }

   static void bubbleSort(int[] arr) {

    int n = arr.length;

    for (int i = 0; i < n - 1; i++) {

        for (int j = 0; j < n - 1 - i; j++) {

            if (arr[j] > arr[j + 1]) {

                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;

            }
        }
    }
}
   
   static long measureTime(int[] original, String algorithm) {
    int[] arr = original.clone();

    long start = System.nanoTime();

    switch (algorithm) {
        case "Selection":
            selectionSort(arr);
            break;

        case "Insertion":
            insertionSort(arr);
            break;

        case "Bubble":
            bubbleSort(arr);
            break;

        
    }

    long end = System.nanoTime();

    return (end - start) / 1000;
}

    public static void main(String[] args) {

        int n = 100000;

int[] randomArray = Randomarr(n);
int[] reverseArray = ReverseSortedarr(n);
int[] partialArray = PartiallySortedarr(n);
int[] sortedArray = FullySortedarr(n);

String[] algorithms = {
    "Selection", "Insertion", "Bubble"
};

int[][] cases = {
    randomArray, reverseArray, partialArray, sortedArray
};

String[] caseNames = {
    "Random", "Reverse", "Partial", "Sorted"
};

System.out.printf("%-12s", "Algorithm");

for (String name : caseNames) {
    System.out.printf("%15s", name);
}
System.out.println();

for (String algorithm : algorithms) {
    System.out.printf("%-12s", algorithm);

    for (int[] data : cases) {
        long time = measureTime(data, algorithm);
        System.out.printf("%15d", time);
    }

    System.out.println();
}
        
        
        
        
        
        
        
//        int n = 10;
//        int[] arr = new int[n];
//
//        Random random = new Random();
//
//        // Fill the array with random numbers
//        for (int i = 0; i < n; i++) {
//            arr[i] = random.nextInt(999) + 1;
//        }
//
////         Print the first 10 elements
//        
//
////        for (int i = 0; i < n; i++) {
////            System.out.println(arr[i]+"\n");  
////        }
//        System.out.println(
//            Arrays.toString(Arrays.copyOf(arr, 10))+"besofore sorting\n"
//        );
//        
//        int[] selectionArray = arr.clone();
//        int[] insertionArray = arr.clone();
//        int[] bubbleArray = arr.clone();
//        int[] quickArray = arr.clone();
//       
//        long start = System.nanoTime();
//
//        selectionSort(selectionArray);
//        System.out.println(
//            Arrays.toString(Arrays.copyOf(selectionArray, 10))
//        );
//
//        long end = System.nanoTime();
//
//        long timeMicroseconds = (end - start) / 1000;
//
//        System.out.println("selection sorting Time: " + timeMicroseconds + " micros\n");
//        
////        *****************************
//        long start1 = System.nanoTime();
//
//        insertionSort(insertionArray);
//        System.out.println(
//            Arrays.toString(Arrays.copyOf(insertionArray, 10))
//        );
//
//        long end1 = System.nanoTime();
//
//        long timeMicroseconds1 = (end1 - start1) / 1000;
//
//        System.out.println("insertion sorting Time: " + timeMicroseconds1 + " micros");
//        
    }
}