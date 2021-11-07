package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Pro03_2DRectangleArea {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете стойност за X1: ");
        double x1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете стойност за Y1: ");
        double y1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете стойност за X2: ");
        double x2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете стойност за Y2: ");
        double y2 = Double.parseDouble(scanner.nextLine());

        double length = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);
        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.printf("%.2f%n%.2f", area, perimeter);

    }
}
