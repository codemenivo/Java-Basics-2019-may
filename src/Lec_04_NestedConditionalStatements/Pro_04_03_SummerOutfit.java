package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_03_SummerOutfit {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете дневната температура: ");
        int degreesC = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете коя част от денонощието е: ");
        String partOfDay = scanner.nextLine();

        String outfit = "";
        String shoes = "";
        switch (partOfDay){
            case "Morning":
                if (degreesC >=25){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degreesC > 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreesC >= 10){
                    outfit = "Sweatshirt";
                    shoes = "Sneakers";
                }
                break;
            case "Afternoon":
                if (degreesC >=25){
                    outfit = "Swim Suit";
                    shoes = "Barefoot";
                } else if (degreesC > 18){
                    outfit = "T-Shirt";
                    shoes = "Sandals";
                } else if (degreesC >= 10){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
            case "Evening":
                if (degreesC >=25){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreesC > 18){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                } else if (degreesC >= 10){
                    outfit = "Shirt";
                    shoes = "Moccasins";
                }
                break;
        }
        System.out.printf("It's %d degrees, get your %s and %s.", degreesC, outfit, shoes);

    }
}
