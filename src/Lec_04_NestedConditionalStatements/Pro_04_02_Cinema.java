package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_02_Cinema {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете типа на прожекцията: ");
        String typeName = scanner.nextLine();
        System.out.print("Въведете броя редове: ");
        int rowsNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете броя колони: ");
        int columnNum = Integer.parseInt(scanner.nextLine());

        double tiketPrice = 0.0;
        int allPlaces = rowsNum * columnNum;
        switch (typeName){
            case "Premiere":
                tiketPrice = 12.00;
                break;
            case "Normal":
                tiketPrice = 7.50;
                break;
            case "Discount":
                tiketPrice = 5.00;
                break;
        }
        double totalSum = allPlaces * tiketPrice;
        System.out.printf("%.2f leva", totalSum);

    }
}
