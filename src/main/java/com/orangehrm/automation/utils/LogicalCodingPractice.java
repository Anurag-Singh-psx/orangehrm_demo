package com.orangehrm.automation.utils;

import java.util.Arrays;
import java.util.Scanner;

public class LogicalCodingPractice {
    public static void main(String[] args) {
        swapString();
    }

    public static void reverseSmallestLargestWord(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter sentence to reverse smallest and largest word :");
        String input = scanner.nextLine();

        String[] arrayInput=input.split(" ");
        System.out.println(arrayInput.length);

        String smallest=arrayInput[0];
        String largest=arrayInput[0];

        for (int i = 1; i < arrayInput.length; i++) {
            if (arrayInput[i].length()<smallest.length()){
                smallest=arrayInput[i];
            }
            if (arrayInput[i].length()>largest.length()){
                largest=arrayInput[i];
            }
        }

        char[] smallestCharArray=smallest.toCharArray();
        char[] largestCharArray=largest.toCharArray();
        System.out.println(Arrays.toString(smallestCharArray));
        System.out.println(Arrays.toString(largestCharArray));

        StringBuilder stringBuilder=new StringBuilder();
        for (int i = smallestCharArray.length-1; i >=0 ; i--) {
            stringBuilder.append(smallestCharArray[i]);
        }
        stringBuilder.append(" ");
        for (int i = largestCharArray.length-1; i >=0 ; i--) {
            stringBuilder.append(largestCharArray[i]);
        }
        System.out.println("Reverse smallest and largest word: " + stringBuilder.toString());
    }

    public static void findLargestNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter integer number (Ex: 97892342):");
        String input = scanner.nextLine();

        String correctedString=input.replace(" ","");

        char[] a=correctedString.toCharArray();
        int[] intArray=new int[a.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i]=Integer.parseInt(String.valueOf(a[i]));
        }

        // Manual sorting using selection sort in descending order
        for (int i = 0; i < intArray.length - 1; i++) {
            for (int j = i + 1; j < intArray.length; j++) {
                // Compare and swap if the current element is smaller than the next
                if (intArray[i] < intArray[j]) {
                    int temp = intArray[i];
                    intArray[i] = intArray[j];
                    intArray[j] = temp;
                }
            }
        }
        System.out.println("From largest to smallest" + Arrays.toString(intArray) );
    }

    public static void findSmallestNumber(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter integer number (Ex: 97892342):");
        String input = scanner.nextLine();

        String correctedString=input.replace(" ","");

        char[] a=correctedString.toCharArray();
        int[] intArray=new int[a.length];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i]=Integer.parseInt(String.valueOf(a[i]));
        }

        for (int i = 0; i < intArray.length-1; i++) {
            for (int j = i+1; j < intArray.length; j++) {
                if (intArray[i]>intArray[j]){
                    int temp =intArray[i];
                    intArray[i]=intArray[j];
                    intArray[j]=temp;
                }
            }
        }
        System.out.println("From smallest to largest" + Arrays.toString(intArray) );
    }

    public static void reverseEachWord(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter sentence to reverse :");
        String input = scanner.nextLine();
        String[] arrayInput=input.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (String s : arrayInput) {
            char[] array = s.toCharArray();
            for (int j = array.length - 1; j >= 0; j--) {
                stringBuilder.append(array[j]);
            }
            stringBuilder.append(" ");
        }

        System.out.println("Reverse smallest and largest word: " + stringBuilder);
    }

    public static void swapString(){
        String input="Anurag Singh";
        String[] splitInput=input.split(" ");
        StringBuilder stringBuilder=new StringBuilder();
        for (int i = splitInput.length-1; i >=0 ; i--) {
            stringBuilder.append(splitInput[i]);
            if (i == splitInput.length - 1) {
                stringBuilder.append(" "); // Append space only after "Singh"
            }
        }
        System.out.println(stringBuilder);
    }
}
