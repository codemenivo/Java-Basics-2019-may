package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Pro06_CharityCampaign {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя дни за кампанията: ");
        int numDay = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете броя на сладкарите: ");
        int confectioners = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете броя на тортите: ");
        int cakeNums = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете броя на гофретите: ");
        int gofretNums = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете броя на палачинките: ");
        int pancakeNums = Integer.parseInt(scanner.nextLine());

        double priceCakes = cakeNums * 45.00;
        double pricegofrets = gofretNums * 5.80;
        double pricePancake = pancakeNums * 3.20;
        double allPricePerDay = (priceCakes + pricegofrets + pricePancake) * confectioners;
        double allSum = allPricePerDay * numDay;

        double campaignSum = allSum - (allSum / 8);
        System.out.printf("%.2f", campaignSum);

    }
}
