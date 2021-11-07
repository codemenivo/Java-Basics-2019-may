package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Lab_04_08_SkiTrip {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете дните за престой: ");
        int deyNums = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете вида на помещението: ");
        String roomName = scanner.nextLine();
        System.out.print("Въведете оценка за престоя: ");
        String review = scanner.nextLine();

        double sumAllDeys = 0.0;
        switch (roomName) {
            case "room for one person":
                sumAllDeys = (deyNums -1) * 18.00;
                break;
            case "apartment":
                if (deyNums > 15) {
                    sumAllDeys = (deyNums -1) * 25.00 * 0.5;
                } else if (deyNums >= 10) {
                    sumAllDeys = (deyNums - 1) * 25.00 * 0.65;
                } else if (deyNums > 0) {
                    sumAllDeys = (deyNums -1) * 25.00 * 0.70;
                }
                break;
            case "president apartment":
                if (deyNums > 15) {
                    sumAllDeys = (deyNums - 1) * 35.00 * 0.80;
                } else if (deyNums >= 10) {
                    sumAllDeys = (deyNums - 1) * 35.00 * 0.85;
                } else if (deyNums > 0) {
                    sumAllDeys = (deyNums - 1) * 35.00 * 0.90;
                }
                break;

        }

        if ("positive".equals(review)){
            sumAllDeys *= 1.25;
        } else {
            sumAllDeys *= 0.90;
        }

        System.out.println(String.format("%.2f", sumAllDeys));


    }
}
