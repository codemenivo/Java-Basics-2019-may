package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_07_WorldSwimmingRecord {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете рекорда в секунди: ");
        double recordInSeconds = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете разстоянието в метри: ");
        double distanceInMeter = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете времето в секунди за 1м плуване: ");
        double timeSuimAMeter = Double.parseDouble(scanner.nextLine());

        double allSuimingTime = distanceInMeter * timeSuimAMeter;
        double delay = Math.floor(distanceInMeter / 15) * 12.5;
        double totalTime = allSuimingTime + delay;

        if (totalTime < recordInSeconds){
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", totalTime);
        } else {
            System.out.printf("No, he failed! He was %.2f seconds slower.", (totalTime - recordInSeconds));
        }


    }
}
