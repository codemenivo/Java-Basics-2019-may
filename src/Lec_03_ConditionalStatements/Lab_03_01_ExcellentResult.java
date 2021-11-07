package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_01_ExcellentResult {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете оценка от изпит: ");
        double grade = Double.parseDouble(scanner.nextLine());

        if (grade >= 5.50){
            System.out.println("Excellent!");
        }

    }
}
