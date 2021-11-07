package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_10_DayOfWeek {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число от 1 до 7 включително: ");
        int inputNum = Integer.parseInt(scanner.nextLine());

        switch (inputNum){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Error");
                break;
        }

    }
}
