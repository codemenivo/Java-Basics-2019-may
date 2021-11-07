package Lec_06_For_Loop;

import java.util.Scanner;

public class Pro_06_05_Histogram {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете N-броя числа, които ще се проверяват: ");
        int num = Integer.parseInt(scanner.nextLine());

        int counterP1 = 0;
        int counterP2 = 0;
        int counterP3 = 0;
        int counterP4 = 0;
        int counterP5 = 0;
        for (int indexNum = 1; indexNum <= num ; indexNum++) {
            System.out.print("Въведи цяло число от 1 до 1000 за проверка: ");
            int inputNumber = Integer.parseInt(scanner.nextLine());

            if (inputNumber >= 800){
                counterP5++;
            } else if (inputNumber >= 600 ){
                counterP4++;
            } else if (inputNumber >= 400){
                counterP3++;
            } else if (inputNumber >= 200){
                counterP2++;
            } else if (inputNumber >= 1){
                counterP1++;
            }
        }
        double percentP1 = counterP1 * 100.0 / num;
        double percentP2 = counterP2 * 100.0 / num;
        double percentP3 = counterP3 * 100.0 / num;
        double percentP4 = counterP4 * 100.0 / num;
        double percentP5 = counterP5 * 100.0 / num;

        System.out.printf("%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%%n%.2f%%", percentP1, percentP2, percentP3, percentP4, percentP5);

    }
}
