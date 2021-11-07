package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_05_TimePlus15Minutes {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете числоза показване на часа: ");
        int hourDigit = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете число показващо минутите: ");
        int minuteDigit = Integer.parseInt(scanner.nextLine());

        int allTineInMinutes = (hourDigit * 60) + minuteDigit + 15;
        int hours = allTineInMinutes / 60;
        int minutes = allTineInMinutes % 60;

        if (hours > 23){
            hours = 0;
        }

        if (minutes < 10){
            System.out.printf("%d:0%d", hours, minutes);
        } else {
            System.out.printf("%d:%d", hours, minutes);
        }

    }
}
