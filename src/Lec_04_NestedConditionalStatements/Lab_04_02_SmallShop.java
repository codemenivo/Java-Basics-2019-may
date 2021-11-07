package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Lab_04_02_SmallShop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете избрания продукт: ");
        String productName = scanner.nextLine();
        System.out.print("Въведете града, в който пазарувате: ");
        String townName = scanner.nextLine();
        System.out.print("Въведете избраното количество от продукта: ");
        double quantity = Double.parseDouble(scanner.nextLine());

        double priceProduct = 0.0;
        if ("Sofia".equalsIgnoreCase(townName)) {
            switch (productName) {
                case "coffee":
                    priceProduct = 0.50;
                    break;
                case "water":
                    priceProduct = 0.80;
                    break;
                case "beer":
                    priceProduct = 1.20;
                    break;
                case "sweets":
                    priceProduct = 1.45;
                    break;
                case "peanuts":
                    priceProduct = 1.60;
                    break;
            }
        } else if ("Plovdiv".equalsIgnoreCase(townName)) {
            switch (productName) {
                case "coffee":
                    priceProduct = 0.40;
                    break;
                case "water":
                    priceProduct = 0.70;
                    break;
                case "beer":
                    priceProduct = 1.15;
                    break;
                case "sweets":
                    priceProduct = 1.30;
                    break;
                case "peanuts":
                    priceProduct = 1.50;
                    break;
            }

        } else if ("Varna".equalsIgnoreCase(townName)) {
            switch (productName) {
                case "coffee":
                    priceProduct = 0.45;
                    break;
                case "water":
                    priceProduct = 0.70;
                    break;
                case "beer":
                    priceProduct = 1.10;
                    break;
                case "sweets":
                    priceProduct = 1.35;
                    break;
                case "peanuts":
                    priceProduct = 1.55;
                    break;
            }
        }
        System.out.println(quantity * priceProduct);

    }
}
