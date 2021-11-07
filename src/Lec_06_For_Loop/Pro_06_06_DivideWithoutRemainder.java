package Lec_06_For_Loop;

import java.util.Scanner;

public class Pro_06_06_DivideWithoutRemainder {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете N-броя числа, които ще се проверяват: ");
        int num = Integer.parseInt(scanner.nextLine());

        int counterP1 = 0;
        int counterP2 = 0;
        int counterP3 = 0;
        for (int indexNum = 1; indexNum <= num ; indexNum++) {
            System.out.print("Въведи цяло число от 1 до 1000 за проверка: ");
            int inputNumber = Integer.parseInt(scanner.nextLine());

            if (inputNumber % 2 == 0){
                counterP1++;

            }
            if (inputNumber % 3 == 0){
                counterP2++;
            }
            if (inputNumber % 4 == 0){
                counterP3++;
            }

        }
        double percentsP1 = counterP1 * 100.0 / num;
        double percentsP2 = counterP2 * 100.0 / num;
        double percentsP3 = counterP3 * 100.0 / num;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%", percentsP1, percentsP2, percentsP3);


    }
}
