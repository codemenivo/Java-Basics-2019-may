package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_04_MetricConverter {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число за преобразуване: ");
        double inputNum = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете входна мерна еденица: ");
        String inputMetrix = scanner.nextLine();
        System.out.print("Въведете изходната мерна еденица: ");
        String outputMetrix = scanner.nextLine();


        if ("mm".equals(inputMetrix)) {
            inputNum /= 1000;
        } else if ("cm".equals(inputMetrix)) {
            inputNum /= 100;
        }

        if ("mm".equals(outputMetrix)) {
            inputNum *= 1000;
        } else if ("cm".equals(outputMetrix)) {
            inputNum *= 100;
        }
        System.out.printf("%.3f", inputNum);

    }
}
