package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_06_Number100_200 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число: ");
        int numInput = Integer.parseInt(scanner.nextLine());

        if (numInput > 200){
            System.out.println("Greater than 200");
        } else if (numInput >= 100){
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Less than 100");
        }

    }
}
