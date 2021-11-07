package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Pro02_RadiansToDegrees {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете стойността на ъгъла в радиани: ");
        double angleRad = Double.parseDouble(scanner.nextLine());

        double angleDegree = angleRad * 180 / Math.PI;
        System.out.printf("%.0f", angleDegree);

    }
}
