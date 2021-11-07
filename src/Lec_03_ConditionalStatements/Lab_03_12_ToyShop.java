package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_12_ToyShop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Въведете цената на екскурзията: ");
        double priceExcursion = Double.parseDouble(scanner.nextLine());
        System.out.println("Въведете броя на поръчаните пъзелите: ");
        int puzzelCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете броя на поръчаните говорещи кукли: ");
        int dolyCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете броя на поръчаните плюшени мечета: ");
        int tedyCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете броя на поръчаните миньони: ");
        int minonCount = Integer.parseInt(scanner.nextLine());
        System.out.println("Въведете броя на поръчаните камиончета: ");
        int trukCount = Integer.parseInt(scanner.nextLine());

        int countToys = puzzelCount + dolyCount + tedyCount + minonCount + trukCount;
        double sumPuzzel = puzzelCount * 2.60;
        double sumDoly = dolyCount * 3.00;
        double sumTedy = tedyCount * 4.10;
        double sumMinon = minonCount * 8.20;
        double sumTruk = trukCount * 2.00;
        double sumOrder = sumDoly + sumMinon + sumPuzzel + sumTedy + sumTruk;

        if (countToys >= 50) {
            sumOrder *= 0.75;
        }
        sumOrder *= 0.9;
        double differen = (sumOrder - priceExcursion);
        if (differen >= 0){
            System.out.printf("Yes! %.2f lv left.", differen);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(differen));
        }

    }
}
