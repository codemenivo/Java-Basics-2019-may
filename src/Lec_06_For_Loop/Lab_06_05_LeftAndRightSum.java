package Lec_06_For_Loop;

import java.util.Scanner;

public class Lab_06_05_LeftAndRightSum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въветете броя на числата N: ");
        int inputN = Integer.parseInt(scanner.nextLine());

        int sumLeft = 0;
        int sumRight = 0;
        for (int readNum = 1; readNum <= inputN * 2 ; readNum++) {
            System.out.print("Въведете цяло число: ");
            int num = Integer.parseInt(scanner.nextLine());

            if (readNum <= inputN){
                sumLeft = sumLeft + num;
            } else {
                sumRight = sumRight + num;
            }
        }

        if (sumLeft == sumRight){
            System.out.printf("Yes, sum = %d", sumLeft);
        } else {
            int diff = Math.abs(sumLeft - sumRight);
            System.out.printf("No, diff = %d", diff);
        }

    }
}
