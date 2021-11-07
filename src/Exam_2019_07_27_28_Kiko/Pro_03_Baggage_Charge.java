package Exam_2019_07_27_28_Kiko;

import java.util.Scanner;

public class Pro_03_Baggage_Charge {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете ширината на куфара в дм: ");
        int width = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете дължината на кугара в дм: ");
        int length = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете височина на куфара в дм: ");
        int height = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете true или false за вида на багажа: ");
        String typeTicket = scanner.nextLine();
        double extraTax = 0.0;

        int volume = width * length * height;
        if (volume <= 50) {
            extraTax = 0.0;
        } else if (volume <= 100){
            switch (typeTicket) {
                case "true":
                    extraTax = 0.0;
                    break;
                case "false":
                    extraTax = 25;
                    break;
            }
        } else if (volume <= 200) {
            switch (typeTicket) {
                case "true":
                    extraTax = 10;
                    break;
                case "false":
                    extraTax = 50;
                    break;
            }
        } else if (volume <= 300) {
            switch (typeTicket) {
                case "true":
                    extraTax = 20;
                    break;
                case "false":
                    extraTax = 100;
                    break;
            }
        }
        System.out.printf("Luggage tax: %.2f", extraTax);



    }
}
