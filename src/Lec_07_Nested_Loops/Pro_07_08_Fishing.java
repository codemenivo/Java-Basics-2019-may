package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_08_Fishing {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число - дневната квота за улов на риба: ");
        int quotaForFish = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете име на уловената риба или Stop: ");
        String fishName = scanner.nextLine();
        int fishCounter = 0;
        double profit = 0.0;

        while (!"Stop".equals(fishName)){

            System.out.print("Въведете теглото на уловената риба: ");
            double fishKg = Double.parseDouble(scanner.nextLine());
            fishCounter++;
            int asciiSum = 0;
            for (int simbolIndex = 0; simbolIndex < fishName.length() ; simbolIndex++) {
                asciiSum += fishName.charAt(simbolIndex);
            }
            double pricePreFish = asciiSum / fishKg;

            if (fishCounter % 3 != 0){
                profit += pricePreFish;
            } else {
                profit -= pricePreFish;
            }

            if (quotaForFish == fishCounter){
                System.out.println("Lyubo fulfilled the quota!");
                break;
            }

            System.out.print("Въведете име на уловената риба или Stop: ");
            fishName = scanner.nextLine();
        }

        if (profit >= 0){
            System.out.printf("Lyubo lost %.2f leva today.", profit);
        } else {
            System.out.printf("Lyubo's profit from %d fishes is %.2f leva.%n", fishCounter, Math.abs(profit));
        }


    }
}
