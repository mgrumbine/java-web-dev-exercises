package exercises;

import java.util.Scanner;

public class MilesPerGallon {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("How many miles have you driven:");
        Double miles = input.nextDouble();

        System.out.println("How many gallons of gas have you used:");
        Double gallonsOfGas = input.nextDouble();

        Double milesPerGallon = miles/gallonsOfGas;
        System.out.println("You are getting " + milesPerGallon + " miles per gallon.");
    }
}