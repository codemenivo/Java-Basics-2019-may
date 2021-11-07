package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_08_HotelRoom {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете име на месец: ");
        String month = scanner.nextLine();
        System.out.print("Въведете брой нощувки: ");
        int numDays = Integer.parseInt(scanner.nextLine());

        double studioPrice = 0.0;
        double aparttmentPrice = 0.0;
        if ("May".equalsIgnoreCase(month) || "October".equalsIgnoreCase(month)){
            if (numDays > 14){
                studioPrice = (50.00 * numDays) * 0.70;
                aparttmentPrice = (65.00 * numDays) * 0.90;
            } else if (numDays > 7){
                studioPrice = (50.00 * numDays) * 0.95;
                aparttmentPrice = 65.00 * numDays;
            } else if (numDays > 0){
                studioPrice = 50.00 * numDays;
                aparttmentPrice = 65.00 * numDays;
            }
        } else if ("June".equalsIgnoreCase(month) || "September".equalsIgnoreCase(month)){
            if (numDays > 14){
                studioPrice = (75.20 * numDays) * 0.80;
                aparttmentPrice = (68.70 * numDays) * 0.90;
            } else if (numDays >0){
                studioPrice = 75.20 * numDays;
                aparttmentPrice = 68.70 * numDays;
            }
        } else if ("July".equalsIgnoreCase(month) || "August".equalsIgnoreCase(month)){
            studioPrice = 76.00 * numDays;
            if (numDays > 14){
                aparttmentPrice = (77.00 * numDays) * 0.90;
            } else if(numDays > 0){
                aparttmentPrice = 77.00 * numDays;
            }
        }

        System.out.printf("Apartment: %.2f lv.%nStudio: %.2f lv.", aparttmentPrice, studioPrice);


    }
}
