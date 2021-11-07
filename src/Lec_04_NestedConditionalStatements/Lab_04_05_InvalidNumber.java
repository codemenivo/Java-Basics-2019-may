package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Lab_04_05_InvalidNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число: ");
        int inputNum = Integer.parseInt(scanner.nextLine());

        boolean isValid = (inputNum >= 100 && inputNum <= 200) || inputNum == 0;
        if (!isValid) {
            System.out.println("invalid");
        }

    }
}
