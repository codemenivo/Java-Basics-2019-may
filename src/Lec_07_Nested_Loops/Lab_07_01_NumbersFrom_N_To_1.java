package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_01_NumbersFrom_N_To_1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число N: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());

        for (int num = inputNumber; num >= 1 ; num--) {

            System.out.printf("%d%n", num);
        }

    }
}
