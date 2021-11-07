package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab04_InchesToCentimeters {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число което показва стоиност в инчове: ");
        double inchs = Double.parseDouble(scanner.nextLine());
        double cantimeters = inchs * 2.54;
        System.out.printf("%.2f", cantimeters);

    }
}
