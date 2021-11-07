package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Pro07_AlcoholMarket {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цената на уискито: ");
        double priceWisky = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете количеството литри на бирата: ");
        double literBeer = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете количеството литри на виното: ");
        double literWine = Double.parseDouble(scanner.nextLine());
        System.out.print("въведете количество литри на ракия: ");
        double literRakiya = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете количеството литри на уискито: ");
        double literWisky = Double.parseDouble(scanner.nextLine());

        double priceRakiya = priceWisky * 0.5;
        double priceWine = priceRakiya - (priceRakiya * 0.4);
        double priceBeer = priceRakiya - (priceRakiya * 0.8);

        double sumRakiya = priceRakiya * literRakiya;
        double sumWine = priceWine * literWine;
        double sumBeer = priceBeer * literBeer;
        double sumWisky = priceWisky * literWisky;

        double totalSum = sumBeer + sumRakiya + sumWine + sumWisky;
        System.out.printf("%.2f", totalSum);

    }
}
