package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_03_EvenOrOdd {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число: ");
        int numInput = Integer.parseInt(scanner.nextLine());

        //if (numInput % 2 == 0){
        //    System.out.println("even");
        //} else {
        //    System.out.println("odd");
        //}

        if (numInput % 2 != 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }

    }
}
