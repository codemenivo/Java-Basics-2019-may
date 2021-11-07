package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab02_ConcatenateData {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Входове - ime, familiq, възраст, град
        System.out.print("Въведи име ");
        String name = scanner.nextLine();
        System.out.print("Въведи фамилия ");
        String secondName = scanner.nextLine();
        System.out.print("Въведи възраст в години: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведи име на град: ");
        String townName = scanner.nextLine();

        System.out.printf("You are %s %s, a %d-years old person from %s.", name, secondName, age, townName);

    }
}
