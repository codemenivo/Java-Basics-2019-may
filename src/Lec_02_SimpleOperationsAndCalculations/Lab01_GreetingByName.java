package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab01_GreetingByName {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведи име на човек: ");
        String name = scanner.nextLine();
        System.out.printf("Hello, %s!%n", name);

    }
}
