package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Lab_05_03_AccountBalance {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя вноски, които ще се правят: ");
        int numPayIn = Integer.parseInt(scanner.nextLine());

        int counPayIn = 1;
        double sum = 0.0;
        while (counPayIn <= numPayIn){

            System.out.print("Въведете сумата която внасяте: ");
            double sumIncome = Double.parseDouble(scanner.nextLine());

            if (sumIncome >= 0){
                sum += sumIncome;
                System.out.printf("Increase: %.2f%n", sumIncome);
                counPayIn = ++counPayIn;
            } else {
                System.out.println("Invalid operation!");
                break;
            }
        }
        System.out.printf("Total: %.2f", sum);

    }
}
