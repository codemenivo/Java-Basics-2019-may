package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Lab_05_01_NumberInRange1To100 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число в интервала от 1 до 100: ");
        int inputNum = Integer.parseInt(scanner.nextLine());

        boolean isNumNotValid = (inputNum < 1) || (inputNum > 100);
        while (isNumNotValid){
            System.out.println("Invalid number!");
            inputNum = Integer.parseInt(scanner.nextLine());
            isNumNotValid = (inputNum < 1) || (inputNum > 100);

        }

        System.out.printf("%d", inputNum);

    }
}
