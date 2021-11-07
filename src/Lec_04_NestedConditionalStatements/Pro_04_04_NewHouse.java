package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_04_NewHouse {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете вида на цветята: ");
        String typeFlower = scanner.nextLine();
        System.out.print("Въведете броя на цветята: ");
        int numberFlowers = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете бюджета с който се разполага: ");
        int budget = Integer.parseInt(scanner.nextLine());
        // "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"

        double sumForFlowers = 0.0;
        if ("Roses".equals(typeFlower)){
            sumForFlowers = numberFlowers * 5.00;
            if (numberFlowers > 80){
                sumForFlowers *= 0.90;
            }
        } else if ("Dahlias".equals(typeFlower)){
            sumForFlowers = numberFlowers * 3.80;
            if (numberFlowers > 90){
                sumForFlowers *= 0.85;
            }
        } else if ("Tulips".equals(typeFlower)){
            sumForFlowers = numberFlowers * 2.80;
            if (numberFlowers > 80){
                sumForFlowers *= 0.85;
            }
        } else if ("Narcissus".equals(typeFlower)){
            sumForFlowers = numberFlowers * 3.00;
            if (numberFlowers < 120){
                sumForFlowers *= 1.15;
            }
        } else if ("Gladiolus".equals(typeFlower)){
            sumForFlowers = numberFlowers * 2.50;
            if (numberFlowers < 80){
                sumForFlowers *= 1.20;
            }
        }

        double differense = Math.abs(budget - sumForFlowers);
        if (budget >= sumForFlowers){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", numberFlowers, typeFlower, differense);
        } else {
            System.out.printf("Not enough money, you need %.2f leva more.", differense);
        }

    }
}
