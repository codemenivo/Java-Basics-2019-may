package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Pro01_USDToBGN {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете сумата в USD: ");
        double usd = Double.parseDouble(scanner.nextLine());

        double bgn = usd * 1.79545;
        System.out.printf("%.2f", bgn);

    }
}
