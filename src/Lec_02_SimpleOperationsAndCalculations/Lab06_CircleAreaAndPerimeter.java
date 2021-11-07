package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab06_CircleAreaAndPerimeter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете дължината на радиуса: ");
        double radius = Double.parseDouble(scanner.nextLine());

        double areaCircle = Math.PI * Math.pow(radius, 2);
        double perimeter = 2 * Math.PI * radius;
        System.out.printf("%.2f%n%.2f", areaCircle, perimeter);

    }
}
