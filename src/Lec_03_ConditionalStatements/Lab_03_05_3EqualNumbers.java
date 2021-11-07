package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_05_3EqualNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведи първото число: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведи второто число: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведи третото число: ");
        int num3 = Integer.parseInt(scanner.nextLine());

        if ((num1 == num2) && (num1 == num3)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
