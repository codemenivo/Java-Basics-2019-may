package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Lab_05_06_Graduation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете името на ученика: ");
        String name = scanner.nextLine();

        double sumValuation = 0.00;
        int counter = 1;
        while (counter <= 12){
            System.out.print("Въведете годишна оценка: ");
            double valuation = Double.parseDouble(scanner.nextLine());
            counter++;
            if (valuation < 4.00){
                counter--;
            } else {
                sumValuation += valuation;
            }
        }
        sumValuation = sumValuation / 12;
        System.out.printf("%s graduated. Average grade: %.2f", name, sumValuation);

    }
}
