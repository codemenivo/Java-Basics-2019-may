package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Lab_04_06_FruitShop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете име на плод: ");
        String fruitName = scanner.nextLine();
        System.out.print("Въведете име на ден от седмицата: ");
        String dayName = scanner.nextLine();
        System.out.print("Въведете количество: ");
        double quantity = Double.parseDouble(scanner.nextLine());

        //(banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
        //Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
        double price = 0.0;
        double totalPrice = 0.0;
        boolean isWorkDay = "Monday".equals(dayName) || "Tuesday".equals(dayName) ||
                "Wednesday".equals(dayName) || "Thursday".equals(dayName) || "Friday".equals(dayName);
        boolean isHoliday = "Saturday".equals(dayName) || "Sunday".equals(dayName);
        boolean isValidFruit = "banana".equals(fruitName) || "apple".equals(fruitName) || "orange".equals(fruitName)
                || "kiwi".equals(fruitName)|| "grapefruit".equals(fruitName) || "pineapple".equals(fruitName)
                || "grapes".equals(fruitName);
        if (isWorkDay && isValidFruit) {

            switch (fruitName) {
                case "banana":
                    price = 2.50;
                    break;
                case "apple":
                    price = 1.20;
                    break;
                case "orange":
                    price = 0.85;
                    break;
                case "grapefruit":
                    price = 1.45;
                    break;
                case "kiwi":
                    price = 2.70;
                    break;
                case "pineapple":
                    price = 5.50;
                    break;
                case "grapes":
                    price = 3.85;
                    break;
            }
            totalPrice = quantity * price;
            System.out.printf("%.2f", totalPrice);


        } else if (isHoliday && isValidFruit){
            switch (fruitName){
                case "banana":
                    price = 2.70;
                    break;
                case "apple":
                    price = 1.25;
                    break;
                case "orange":
                    price = 0.90;
                    break;
                case "grapefruit":
                    price = 1.60;
                    break;
                case "kiwi":
                    price = 3.00;
                    break;
                case "pineapple":
                    price = 5.60;
                    break;
                case "grapes":
                    price = 4.20;
                    break;
            }
            totalPrice = quantity * price;
            System.out.printf("%.2f", totalPrice);


        } else {
            System.out.println("error");
        }

    }
}
