package exercises;


import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> arrayListOfIntergers = new ArrayList<>();
        arrayListOfIntergers.add(6);
        arrayListOfIntergers.add(13);
        arrayListOfIntergers.add(18);
        arrayListOfIntergers.add(25);
        arrayListOfIntergers.add(30);
        arrayListOfIntergers.add(37);
        arrayListOfIntergers.add(42);
        arrayListOfIntergers.add(49);
        arrayListOfIntergers.add(54);
        arrayListOfIntergers.add(60);

        ArrayList<String> arrayListOfStrings = new ArrayList<>();
        arrayListOfStrings.add("word");
        arrayListOfStrings.add("earth");
        arrayListOfStrings.add("quark");
        arrayListOfStrings.add("mercury");
        arrayListOfStrings.add("jupiter");
        arrayListOfStrings.add("mars");
        arrayListOfStrings.add("pluto");
        arrayListOfStrings.add("neptune");
        arrayListOfStrings.add("saturn");
        arrayListOfStrings.add("venus");

        System.out.println(sumOfEvenNums(arrayListOfIntergers));
        System.out.println(wordsOfACertainLength(arrayListOfStrings));
    }

    public static int sumOfEvenNums(ArrayList<Integer> arrayList) {
        int totalOfEvenNums = 0;
        for (int i : arrayList) {
            if (i % 2 == 0) {
                totalOfEvenNums += i;
            }
        }
        return totalOfEvenNums;
    }

    public static ArrayList<String> wordsOfACertainLength(ArrayList<String> arrayList) {
        ArrayList<String> arrayListToPrint = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the word length you want to print:");
        int userWordLength = input.nextInt();
        input.close();
        for (String i : arrayList){
            if (i.length() == userWordLength){
                arrayListToPrint.add(i);
            }
        } return arrayListToPrint;


        }


    }
