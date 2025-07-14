package com.orangehrm.automation.utils;

import java.util.*;

public class LogicalCodingPractice {
    public static void main(String[] args) {
        practice4();
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

    public static void practice1(){
        HashMap<String,String> innerMap=new HashMap<>();
        innerMap.put("E","10");
        innerMap.put("B","20");

        HashMap<String,Object> outerMap=new HashMap<>();
        outerMap.put("A","30");
        outerMap.put("G",innerMap);
        outerMap.put("F","40");
        outerMap.put("S","50");

        System.out.println(outerMap);
    }

    public static void practice2(){
        // I/P=> [1,2,3] [a,b,c] O/P=> [1,a,2,b,3,c]

        ArrayList<String> List1=new ArrayList<>();
        List1.add("1");
        List1.add("2");
        List1.add("3");

        ArrayList<String> List2=new ArrayList<>();
        List2.add("a");
        List2.add("b");
        List2.add("c");
        StringBuilder stringBuilder=new StringBuilder();

        for (int i = 0; i < List1.size(); i++) {
            stringBuilder.append(List1.get(i)).append(",").append(" ").append(List2.get(i)).append(",").append(" ");
        }


        System.out.println(stringBuilder);

        ArrayList<String> List3=new ArrayList<>();
        for (int i = 0; i < List1.size(); i++) {
            List3.add(List1.get(i));
            List3.add(List2.get(i));
        }
        System.out.println(List3);
    }

    public static void practice3(){
        // I/P=> tomorrow  O/P=> tom$rrow

        String input="Tomorrow";
        int count=1;
        StringBuilder stringBuilder=new StringBuilder();
        for (char output:input.toCharArray()){
            if (output=='O' || output=='o'){
                if (count==2){
                    stringBuilder.append("$");
                }
                count++;
            }
            stringBuilder.append(output);
        }

        System.out.println(stringBuilder);
    }

    public static void practice4(){
        // I/P=> [1,2,4,2,5,9,2]  O/P=> tom$rrow

        int[] input={1,2,4,2,5,9,2};

        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (input[i]>input[j]){
                    int temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }
        }
        Set<Integer> sortedSet= new TreeSet<Integer>();
        System.out.println(Arrays.toString(input));
        for (int num:input){
            sortedSet.add(num);
        }
        System.out.println(sortedSet);

        List<Integer> integers=new ArrayList<>(sortedSet);
        System.out.println("Second smallest number: "+integers.get(1));
    }

    public static void practice5(){
        // I/P=> [1,2,4,2,5,9,2]  O/P=> tom$rrow

        int[] input={1,2,4,2,5,9,2};

        for (int i = 0; i < input.length; i++) {
            for (int j = i+1; j < input.length; j++) {
                if (input[i]<input[j]){
                    int temp=input[i];
                    input[i]=input[j];
                    input[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(input));
        Set<Integer> sortedSet= new TreeSet<>(Collections.reverseOrder());
        for (int num:input){
            sortedSet.add(num);
        }
        List<Integer> integers=new ArrayList<>(sortedSet);
        System.out.println("Second largest number: "+integers.get(1));
    }

    public static void practice6(){

        String[] input={"a","v","1","5","@","sam"};

        System.out.println("Select a value to search its index :"+ Arrays.toString(input));

        Scanner scanner=new Scanner(System.in);
        String searchParameter= scanner.nextLine();
        boolean flag=false;
        for (int i = 0; i < input.length; i++) {
            if (input[i].equals(searchParameter)){
                System.out.println("Index number for given search value : "+i );
                flag=true;
                break;
            }
        }
        if (!flag){
            System.out.println("Please check you have entered correct value");
        }
    }

    public static void practice7(){
        //input="My  Name   Is  SriRam" O/P="My Name Is SriRam"
        String input="My  Name   Is  SriRam";
        String[] splitted=input.trim().split("\\s+");
        System.out.println("Select a value to search its index :"+ Arrays.toString(splitted));
        String result = String.join(" ", splitted);
        System.out.println("Select a value to search its index :"+ result);

        String output =input.trim().replaceAll("\\s+", " ");
        System.out.println("Select a value to search its index :"+ output);

    }

}
