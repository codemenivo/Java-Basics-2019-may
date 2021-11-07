package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_06_Journey {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете наличния бюджет: ");
        double budget = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете сезона Summer or Winter: ");
        String season = scanner.nextLine();

        String location = "";
        String placeHoliday = "";
        double spendMoney = 0.0;
        if ((budget > 1000) && ("Summer".equalsIgnoreCase(season) || "Winter".equalsIgnoreCase(season))){
            spendMoney = budget * 0.90;
            location = "Europe";
            placeHoliday = "Hotel";
        } else if (budget > 100){
            location = "Balkans";
            if ("Summer".equalsIgnoreCase(season)){
                placeHoliday = "Camp";
                spendMoney = budget * 0.40;
            } else {
                placeHoliday = "Hotel";
                spendMoney = budget * 0.80;
            }

        } else if (budget > 0){
            location = "Bulgaria";
            if ("Summer".equalsIgnoreCase(season)){
                placeHoliday = "Camp";
                spendMoney = budget * 0.30;
            } else {
                placeHoliday = "Hotel";
                spendMoney = budget * 0.70;
            }

        }

        System.out.printf("Somewhere in %s%n%s - %.2f", location, placeHoliday, spendMoney);

    }
}
