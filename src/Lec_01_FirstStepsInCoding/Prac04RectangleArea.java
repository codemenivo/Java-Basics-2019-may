package Lec_01_FirstStepsInCoding;

import java.util.Scanner;

public class Prac04RectangleArea {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете дължина на страната a = ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете ширината на правоъгълника b = ");
        double b = Double.parseDouble(scanner.nextLine());
        System.out.println(a * b);

    }
}
