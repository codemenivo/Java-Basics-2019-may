package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab08_YardGreening {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете площа за озеленяване: ");
        double area = Double.parseDouble(scanner.nextLine());

        double priceForArea = area * 7.61;
        double discount = priceForArea * 0.18;
        double finalPrice = priceForArea - discount;

        System.out.printf("The final price is: %.2f lv.%nThe discount is: %.2f lv.", finalPrice, discount);

    }
}
