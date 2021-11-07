package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_03_SpeedInfo {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число показващо скороста: ");
        double inputSpeed = Double.parseDouble(scanner.nextLine());

        if (inputSpeed > 1000){
            System.out.println("extremely fast");
        } else if (inputSpeed > 150){
            System.out.println("ultra fast");
        } else if (inputSpeed > 50){
            System.out.println("fast");
        } else if (inputSpeed > 10){
            System.out.println("average");
        } else {
            System.out.println("slow");
        }

    }
}
