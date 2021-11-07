package Lec_06_For_Loop;

import java.util.Scanner;

public class Lab_06_06_OddEvenSum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на числата N за въвеждане: ");
        int inputN = Integer.parseInt(scanner.nextLine());

        int sumOdd = 0;
        int sumEven = 0;
        for (int i = 1; i <= inputN; i++) {
            System.out.print("Въведете цяло число: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (i % 2 == 0){
                sumEven = sumEven + num;
            } else {
                sumOdd = sumOdd + num;
            }
        }

        int diff = Math.abs(sumEven - sumOdd);
        if (diff == 0){
            System.out.printf("Yes%nSum = %d", sumEven);
        } else {
            System.out.printf("No%nDiff = %d", diff);
        }


    }
}
