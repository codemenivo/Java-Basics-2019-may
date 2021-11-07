package Lec_06_For_Loop;

import java.util.Scanner;

public class Lab_06_04_NumberSequence {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("въведете броя на целите числа за въвеждане: ");
        int nNumbers = Integer.parseInt(scanner.nextLine());

        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 1; i <= nNumbers; i++) {
            System.out.print("Въведете цяло число: ");
            int inputNum = Integer.parseInt(scanner.nextLine());

            if (inputNum > maxNum) {
                maxNum = inputNum;
            }
            if (inputNum < minNum) {
                minNum = inputNum;
            }

        }
        System.out.printf("Max number: %d%nMin number: %d", maxNum, minNum);

    }
}
