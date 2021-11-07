package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_01_Matrix {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първия елемат от матрицата Num1.1: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете следващ елемат от матрицата Num1.2: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете първия елемат от втория ред на матрицата Num2.1: ");
        int num3 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете следващ елемат от втория ред на матрицата Num2.2: ");
        int num4 = Integer.parseInt(scanner.nextLine());

        for (int a1_1 = num1; a1_1 <= num2 ; a1_1++) {
            for (int a1_2 = num1; a1_2 <= num2 ; a1_2++) {
                for (int b2_1 = num3; b2_1 <= num4 ; b2_1++) {
                    for (int b2_2 = num3; b2_2 <= num4 ; b2_2++) {

                        if ((a1_1 + b2_2) == (a1_2 + b2_1) && (a1_1 != a1_2) && (b2_1 != b2_2)){
                            System.out.printf("%d%d%n%d%d%n%n", a1_1, a1_2, b2_1, b2_2);
                        }
                    }

                }

            }
        }


    }
}
