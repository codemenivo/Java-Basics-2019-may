package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_01_SumSeconds {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете времето на спортист 1 в секунди: ");
        int time1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете времето на спортист 2 в секунди: ");
        int time2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете времето на спортист 3 в секунди: ");
        int time3 = Integer.parseInt(scanner.nextLine());

        int sumTimeInSeconds = time1 + time2 + time3;
        int timeInMinutes = sumTimeInSeconds / 60;
        int timeInSeconds = sumTimeInSeconds % 60;

        if (timeInSeconds < 10){
            System.out.printf("%d:0%d", timeInMinutes, timeInSeconds);
        } else {
            System.out.printf("%d:%d", timeInMinutes, timeInSeconds);
        }

    }
}
