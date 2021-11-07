package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_08_Scholarship {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Това е кода от упражненията и дава 100/100 в Pro_03_08_01 е моя код, който след корекция даде 100/100
        System.out.print("Въведете доход в лева за член от семейството: ");
        double averigeIncome = Double.parseDouble(scanner.nextLine());
        System.out.print(" Въведете средния успех на ученика: ");
        double averageSuccess = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете минималната работна заплата: ");
        double minimalSalary = Double.parseDouble(scanner.nextLine());

        double successScholarship = 0.0;
        double socialScholarship = 0.0;

        if (averageSuccess > 4.50 && averigeIncome <= minimalSalary){
            socialScholarship = minimalSalary * 0.35;
        }

        if (averageSuccess >= 5.50){
            successScholarship = averageSuccess * 25;
        }

        if (successScholarship == 0 && socialScholarship == 0){
            System.out.println("You cannot get a scholarship!");
        } else if (socialScholarship > successScholarship){
            System.out.println(String.format("You get a Social scholarship %.0f BGN", Math.floor(socialScholarship)));
        } else if (successScholarship >= socialScholarship){
            System.out.println(String.format("You get a scholarship for excellent results %.0f BGN", Math.floor(successScholarship)));
        }


    }
}
