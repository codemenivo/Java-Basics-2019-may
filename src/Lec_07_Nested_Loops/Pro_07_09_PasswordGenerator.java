package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_09_PasswordGenerator {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число N от 1 до 9: ");
        int passNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете цяло число L ot 1 do 9: ");
        int passLetters = Integer.parseInt(scanner.nextLine());

        for (int num1 = 1; num1 < passNum ; num1++) {
            for (int num2 = 1; num2 < passNum ; num2++) {
                for (char letter1 = 'a'; letter1 < 'a' + passLetters ; letter1++) {
                    for (char letter2 = 'a'; letter2 < 'a' + passLetters ; letter2++) {
                        for (int num3 = 1; num3 <= passNum ; num3++) {
                            if (num3 > num1 && num3 > num2)
                                System.out.printf("%d%d%c%c%d ", num1, num2, letter1, letter2, num3);

                        }

                    }

                }

            }

        }

    }
}
