package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_01_PointOnRectangleBorder {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете координата на точка X1: ");
        double pointX1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете координата на точка Y1: ");
        double pointY1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете координата на точка X2: ");
        double pointX2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете координата на точка Y2: ");
        double pointY2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете координата на точка X: ");
        double pointX = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете координата на точка Y: ");
        double pointY = Double.parseDouble(scanner.nextLine());

        boolean isValidX = (pointX >= pointX1 && pointX <= pointX2) && (pointY == pointY1 || pointY == pointY2);
        boolean isValidY = (pointY >= pointY1 && pointY <= pointY2) && (pointX == pointX1 || pointX == pointX2);

        if (isValidX || isValidY) {
            System.out.println("Border");
        } else {
            System.out.println("Inside / Outside");
        }

    }
}
