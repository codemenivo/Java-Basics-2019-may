package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab07_PetShop {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете броя на кучетата: ");
        int numbersDogs = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете броя на останалита животни: ");
        int otherPets = Integer.parseInt(scanner.nextLine());

        double allSum = (numbersDogs * 2.50) + (otherPets * 4.00);
        System.out.printf("%.2f lv.", allSum);

    }
}
