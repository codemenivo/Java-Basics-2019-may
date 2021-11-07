package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Lab_04_07_TradeCommissions {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете име на град: ");
        String cityName = scanner.nextLine();
        System.out.print("Въведете обема на продажбите: ");
        double volumSales = Double.parseDouble(scanner.nextLine());

        double discount = 0.0;
        boolean isValidCityName = "Sofia".equals(cityName) || "Varna".equals(cityName)
                || "Plovdiv".equals(cityName);

        if (volumSales >= 0 && isValidCityName){
            switch (cityName) {
                case "Sofia":
                    if (volumSales > 10000) {
                        discount = volumSales * 0.12;
                    } else if (volumSales > 1000) {
                        discount = volumSales * 0.08;
                    } else if (volumSales > 500) {
                        discount = volumSales * 0.07;
                    } else if (volumSales >= 0) {
                        discount = volumSales * 0.05;
                    }
                    break;
                case "Varna":
                    if (volumSales > 10000) {
                        discount = volumSales * 0.13;
                    } else if (volumSales > 1000) {
                        discount = volumSales * 0.10;
                    } else if (volumSales > 500) {
                        discount = volumSales * 0.075;
                    } else if (volumSales >= 0) {
                        discount = volumSales *= 0.045;
                    }
                    break;
                case "Plovdiv":
                    if (volumSales > 10000) {
                        discount = volumSales * 0.145;
                    } else if (volumSales > 1000) {
                        discount = volumSales * 0.12;
                    } else if (volumSales > 500) {
                        discount = volumSales * 0.08;
                    } else if (volumSales >= 0) {
                        discount = volumSales * 0.055;
                    }
                    break;

            }
            System.out.println(String.format("%.2f", discount));

        } else {
            System.out.println("error");
        }

    }
}
