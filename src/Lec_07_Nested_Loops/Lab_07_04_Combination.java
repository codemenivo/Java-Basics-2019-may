package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_04_Combination {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число N за което ще проверяваме броя комбинации: ");
        int inputNumber = Integer.parseInt(scanner.nextLine());

        int count = 0;
        for (int num1 = 0; num1 <= inputNumber ; num1++) {
            for (int num2 = 0; num2 <= inputNumber ; num2++) {
                for (int num3 = 0; num3 <= inputNumber ; num3++) {
                    for (int num4 = 0; num4 <= inputNumber ; num4++) {
                        for (int num5 = 0; num5 <= inputNumber ; num5++) {
                            int result = num1 + num2 + num3 + num4 + num5;
                            if (result == inputNumber){
                                count++;
                            }

                        }
                    }

                }
            }

        }
        System.out.printf("%d", count);

    }
}
