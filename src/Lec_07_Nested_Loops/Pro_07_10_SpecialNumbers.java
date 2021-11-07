package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_10_SpecialNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число за да проверим кои саспечиалните му числа: ");
        int inputNum = Integer.parseInt(scanner.nextLine());

        for (int num1 = 1; num1 <= 9 ; num1++) {
            for (int num2 = 1; num2 <= 9 ; num2++) {
                for (int num3 = 1; num3 <= 9 ; num3++) {
                    for (int num4 = 1; num4 <= 9 ; num4++) {

                        if (inputNum % num1 == 0 && inputNum % num2 == 0 && inputNum % num3 == 0 &&
                                inputNum % num4 == 0){
                            System.out.printf("%d%d%d%d ", num1, num2, num3, num4);
                        }


                    }

                }

            }

        }

    }
}
