package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_02_GreaterNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведи първото число: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведи второто число: ");
        int num2 = Integer.parseInt(scanner.nextLine());

        if (num1 > num2){
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

    }
}
