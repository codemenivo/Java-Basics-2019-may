package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_04_EqualSumsEvenOddPosition {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първото шестцифрено число: ");
        int firstNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете второто шестцифрено число: ");
        int secondNum = Integer.parseInt(scanner.nextLine());


        for (int num = firstNum; num <= secondNum ; num++) {
            String numToString = ("" + num);
            int lengthNum = numToString.length();
            int sumOddDigit = 0;
            for (int oddIndex = 0; oddIndex < lengthNum ; oddIndex = oddIndex + 2) {
                int oddIndexDigit = Integer.parseInt("" + numToString.charAt(oddIndex));
                sumOddDigit = sumOddDigit + oddIndexDigit;
            }

            int sumEventDigit = 0;
            for (int evenIndex = 1; evenIndex < lengthNum ; evenIndex = evenIndex + 2) {
                int evenIndexDigit = Integer.parseInt("" + numToString.charAt(evenIndex));
                sumEventDigit = sumEventDigit + evenIndexDigit;
            }

            if (sumEventDigit == sumOddDigit){
                System.out.printf("%d ", num);
            }

        }

    }
}
