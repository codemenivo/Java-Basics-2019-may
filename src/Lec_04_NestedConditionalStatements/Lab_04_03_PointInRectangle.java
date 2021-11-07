package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Lab_04_03_PointInRectangle {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете точка от координатната система X1: ");
        double x1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете точка от координатната система Y1: ");
        double y1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете точка от координатната система X2: ");
        double x2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете точка от координатната система Y2: ");
        double y2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете точка от координатната система X: ");
        double x = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете точка от координатната система Y: ");
        double y = Double.parseDouble(scanner.nextLine());

        boolean pointInRectangle = (x >= x1 && x <= x2) && (y >= y1 && y <= y2);

        if (pointInRectangle) {
            System.out.println("Inside");
        } else {
            System.out.println("Outside");
        }

    }
}
