package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_03_Coding {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число и го прочетете като стринг: ");
        String inputNum = scanner.nextLine();

        for (int currentIndex = inputNum.length() - 1; currentIndex >= 0 ; currentIndex--) {
            char currentDigit = inputNum.charAt(currentIndex);
            int currentDigitToNum = Integer.parseInt("" + currentDigit);

            if (currentDigitToNum == 0){
                System.out.println("ZERO");
                continue;
            }

            for (int printing = 1; printing <= currentDigitToNum ; printing++) {
                System.out.print((char)(currentDigitToNum + 33));

            }
            System.out.println();
        }


    }
}
