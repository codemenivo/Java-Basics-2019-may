package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_08_01ScholarshipVariant2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Това е моето решение, което е по усложнено. Решение от упражненията е Pro_03_08
        System.out.print("Въведете доход в лева за член от семейството: ");
        double averigeIncome = Double.parseDouble(scanner.nextLine());
        System.out.print(" Въведете средния успех на ученика: ");
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете минималната работна заплата: ");
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double successScholarship = 0.0;
        double socialScholarship = 0.0;
        if (averigeIncome < minimalSalary){
            socialScholarship = Math.floor(minimalSalary * 0.35);
        }
        if (averageSuccess >= 5.50){
            successScholarship = averageSuccess * 25;
        }
        if (averageSuccess <= 4.50){
            System.out.println("You cannot get a scholarship!");
        } else if (averageSuccess > 4.50 && averageSuccess < 5.50){
            if (averigeIncome > minimalSalary){
                System.out.println("You cannot get a scholarship!");
            } else {
                System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
            }
        } else if (averageSuccess >= 5.50){
            if (averigeIncome >= minimalSalary){
                System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(successScholarship));
            } else {
                if (successScholarship >= socialScholarship){
                    System.out.printf("You get a scholarship for excellent results %.0f BGN", Math.floor(successScholarship));
                } else {
                    System.out.printf("You get a Social scholarship %.0f BGN", socialScholarship);
                }
            }
        }
    }
}
