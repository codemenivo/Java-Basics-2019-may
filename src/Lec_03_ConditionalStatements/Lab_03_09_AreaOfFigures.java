package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_09_AreaOfFigures {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете име на фигурата - square, rectangle, circle, triangle: ");
        String figureName = scanner.nextLine();

        double area = 0;
        if ("square".equals(figureName)){
            System.out.print("Въведете дължина на страната на квадрата: ");
            double lengthSquare = Double.parseDouble(scanner.nextLine());
            area = Math.pow(lengthSquare, 2);
        } else if ("rectangle".equals(figureName)){
            System.out.print("Въведете дължина на страната на правоъгълника: ");
            double lengthRectangle = Double.parseDouble(scanner.nextLine());
            System.out.print("Въведете ширина на страната на правоъгълника: ");
            double widtnRectangle = Double.parseDouble(scanner.nextLine());
            area = lengthRectangle * widtnRectangle;
        } else if ("circle".equals(figureName)){
            System.out.print("Въведете радиуса на кръга: ");
            double radius = Double.parseDouble(scanner.nextLine());
            area = Math.PI * Math.pow(radius, 2);
        } else if ("triangle".equals(figureName)){
            System.out.print("Въведете дължина на страната на триъгълника: ");
            double lengthTriangle = Double.parseDouble(scanner.nextLine());
            System.out.print("Въведете дължина на височината на триъгълника: ");
            double heightTriangle = Double.parseDouble(scanner.nextLine());
            area = lengthTriangle * heightTriangle / 2;
        }
        System.out.printf("%.3f", area);

    }
}
