package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_02_NumberPyramid {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("въведете цяло число, което показва броя числа в пирамидата: ");
        int inputnum = Integer.parseInt(scanner.nextLine());

        int countNum = 1;
        boolean isCountBigger = false;
        for (int row = 1; row <= inputnum ; row++) {
            for (int col = 1; col <= row ; col++) {
                if (countNum > inputnum){
                    isCountBigger = true;
                    break;
                }
                System.out.printf("%d ", countNum);
                countNum++;

            }
            if (isCountBigger){
                break;
            }
            System.out.println();
        }

    }
}
