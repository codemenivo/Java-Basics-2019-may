package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_06_GodzillaVsKong {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете сума за бюджет на филма: ");
        double budgetFilm = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете броя на статистите: ");
        int numberArtists = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете цената на един костюм за артист: ");
        double priceArtSuite = Double.parseDouble(scanner.nextLine());

        double sumDecor = budgetFilm * 0.1;
        double sumArtSuite = numberArtists * priceArtSuite;
        if (numberArtists > 150){
            sumArtSuite *=0.9;
        }
        double allCosts = sumDecor + sumArtSuite;

        if (allCosts > budgetFilm){
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", (allCosts - budgetFilm));
        } else {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", (budgetFilm - allCosts));
        }

    }
}
