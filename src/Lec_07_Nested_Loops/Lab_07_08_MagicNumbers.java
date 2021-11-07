package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_08_MagicNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число за намиране на всички магически числа: ");
        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int num1 = 1; num1 <= 9 ; num1++) {
            for (int num2 = 1; num2 <= 9 ; num2++) {
                for (int num3 = 1; num3 <= 9; num3++) {
                    for (int num4 = 1; num4 <= 9; num4++) {
                        for (int num5 = 1; num5 <= 9; num5++) {
                            for (int num6 = 1; num6 <= 9; num6++) {
                                int result = num1 * num2 * num3 * num4 * num5 * num6;
                                if (result == inputNum){
                                    System.out.printf("%d%d%d%d%d%d ", num1, num2, num3, num4, num5, num6);
                                }

                            }
                        }
                    }
                }
            }
        }

    }
}
