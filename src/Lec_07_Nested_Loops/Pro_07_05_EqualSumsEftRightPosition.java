package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_05_EqualSumsEftRightPosition {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете едно петцифрено число: ");
        int firstInputNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете второ петцифрено число по-голямо от първото: ");
        int secondInputNum = Integer.parseInt(scanner.nextLine());

        for (int currentNum = firstInputNum; currentNum <= secondInputNum ; currentNum++) {
            String currentNumToString = ("" + currentNum);
            int sumRightTwoDigit = 0;
            int sumLeftTwoDigit = 0;
            int middleDigit = 0;
            for (int indexDigitNumToString = 0; indexDigitNumToString < currentNumToString.length(); indexDigitNumToString++) {

                if (indexDigitNumToString <= 1){
                    int leftDigit = Integer.parseInt("" + currentNumToString.charAt(indexDigitNumToString));
                    sumLeftTwoDigit = sumLeftTwoDigit + leftDigit;
                } else if (indexDigitNumToString == 2){
                    int middleCurrentDigit = Integer.parseInt("" + currentNumToString.charAt(indexDigitNumToString));
                    middleDigit = middleCurrentDigit;
                } else {
                    int rightDigit = Integer.parseInt("" + currentNumToString.charAt(indexDigitNumToString));
                    sumRightTwoDigit = sumRightTwoDigit + rightDigit;

                }

            }

            if (sumLeftTwoDigit == sumRightTwoDigit){
                System.out.printf("%d ", currentNum);
            } else if (sumLeftTwoDigit > sumRightTwoDigit){
                sumRightTwoDigit = sumRightTwoDigit + middleDigit;
                if (sumLeftTwoDigit == sumRightTwoDigit){
                    System.out.printf("%d ", currentNum);
                }
            } else {
                sumLeftTwoDigit = sumLeftTwoDigit + middleDigit;
                if (sumLeftTwoDigit == sumRightTwoDigit){
                    System.out.printf("%d ", currentNum);
                }
            }


        }

    }
}
