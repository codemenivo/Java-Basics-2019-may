package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Pro04TailoringWorkshop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на масите: ");
        int numTables = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете дължина на масата в метри: ");
        double lengthTable = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете широчината на масата в метри: ");
        double widthTable = Double.parseDouble(scanner.nextLine());

        double sideSquare = lengthTable / 2;
        double areaSquare = Math.pow(sideSquare, 2);

        double lengthCoveTable = lengthTable + (2 * 0.3);
        double widthCoveTable = widthTable + (2 * 0.3);
        double areaCoveTable = lengthCoveTable * widthCoveTable;

        double priceUsdSquares = areaSquare * 9 * numTables;
        double priceUsdCoveTables = areaCoveTable * 7 * numTables;
        double allPriceInUSD = priceUsdCoveTables + priceUsdSquares;
        double allPriceInBGN = allPriceInUSD * 1.85;

        System.out.printf("%.2f USD%n%.2f BGN", allPriceInUSD, allPriceInBGN);

    }
}
