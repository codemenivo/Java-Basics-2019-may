package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_02_NumbersFrom_1_To_N_WithStep3 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число N: ");
        int inpitNum = Integer.parseInt(scanner.nextLine());

        for (int num = 1; num <= inpitNum ; num += 3) {
            System.out.printf("%d%n", num);
        }


    }
}
