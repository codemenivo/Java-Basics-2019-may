package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab03_SquareArea {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете дължина на страната на кведрат: ");
        int length = Integer.parseInt(scanner.nextLine());

        int squareArea = length * length;
        System.out.println(squareArea);

    }
}
