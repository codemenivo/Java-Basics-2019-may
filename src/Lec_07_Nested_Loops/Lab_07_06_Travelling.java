package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_06_Travelling {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете име на желаната дестинацията: ");
        String destinationName = scanner.nextLine();




        while (!"End".equalsIgnoreCase(destinationName)){
            System.out.print("Въведете цена на пътуването: ");
            double minBudget = Double.parseDouble(scanner.nextLine());
            double currentSum = 0;

            while (currentSum < minBudget){
                System.out.print("Въведете спестена сума: ");
                double money = Double.parseDouble(scanner.nextLine());
                currentSum = currentSum + money;

                if (currentSum >= minBudget){
                    System.out.printf("Going to %s!%n", destinationName);
                }
            }

            System.out.print("Въведете име на желаната дестинацията или End: ");
            destinationName = scanner.nextLine();

        }

    }
}
