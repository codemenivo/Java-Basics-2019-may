package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_05_FishingBoat {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете бюджета на рибарите: ");
        int budget = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете сезона на риболов: ");
        String season = scanner.nextLine();
        System.out.print("Въведете броя на рибарите: ");
        int numFishers = Integer.parseInt(scanner.nextLine());

        // "Spring", "Summer", "Autumn", "Winter"

        double fishingTax = 0.0;
        if ("Spring".equals(season)){
            if (numFishers >= 12){
                fishingTax = 3000 * 0.75;
            } else if (numFishers >= 7){
                fishingTax = 3000 * 0.85;
            } else if (numFishers > 0){
                fishingTax = 3000 * 0.90;
            }
        } else if ("Summer".equals(season)){
            if (numFishers >= 12){
                fishingTax = 4200 * 0.75;
            } else if (numFishers >= 7){
                fishingTax = 4200 * 0.85;
            } else if (numFishers > 0){
                fishingTax = 4200 * 0.90;
            }
        } else if ("Autumn".equals(season)){
            if (numFishers >= 12){
                fishingTax = 4200 * 0.75;
            } else if (numFishers >= 7){
                fishingTax = 4200 * 0.85;
            } else if (numFishers > 0){
                fishingTax = 4200 * 0.90;
            }
        } else if ("Winter".equals(season)){
            if (numFishers >= 12){
                fishingTax = 2600 * 0.75;
            } else if (numFishers >= 7){
                fishingTax = 2600 * 0.85;
            } else if (numFishers > 0){
                fishingTax = 2600 * 0.90;
            }
        }

        boolean isValidDiscountEven = "Spring".equals(season) || "Summer".equals(season) || "Winter".equals(season);
        if (isValidDiscountEven && (numFishers % 2 == 0)){
            fishingTax *= 0.95;
        }

        double difference = Math.abs(budget - fishingTax);
        if (budget >= fishingTax){
            System.out.printf("Yes! You have %.2f leva left.", difference);
        } else {
            System.out.printf("Not enough money! You need %.2f leva.", difference);
        }

    }
}
