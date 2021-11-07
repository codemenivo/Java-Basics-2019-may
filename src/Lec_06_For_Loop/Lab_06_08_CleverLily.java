package Lec_06_For_Loop;

import java.util.Scanner;

public class Lab_06_08_CleverLily {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете възрастта на Лили в години: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете цената на пералнята: ");
        double priceWashMash = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете цената на която продава играчките си: ");
        int priceToys = Integer.parseInt(scanner.nextLine());

        double sumSaleToys = 0;
        double sumEvenBirthdays = 0;
        for (int birthday = 1; birthday <= age ; birthday++) {


            if (birthday % 2 != 0){
                sumSaleToys += priceToys;
            } else {
                sumEvenBirthdays = sumEvenBirthdays + ((birthday / 2.0 * 10) - 1);
            }

        }

        double totalSum = sumEvenBirthdays + sumSaleToys;
        if (totalSum >= priceWashMash){
            System.out.printf("Yes! %.2f", (totalSum - priceWashMash));
        } else {
            System.out.printf("No! %.2f", (priceWashMash - totalSum));
        }


    }
}
