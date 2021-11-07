package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Lab_05_07_GraduationPt_2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете името на оценявания ученик: ");
        String name = scanner.nextLine();

        double sumValuation = 0.0;
        int counterExams = 1;
        int counterExcluded = 0;
        while ((counterExams <= 12) && (counterExcluded < 2) ) {
            System.out.print("Въведете годишната оценка: ");
            double valuation = Double.parseDouble(scanner.nextLine());
            counterExams++;

            if (valuation < 4) {
                counterExams--;
                counterExcluded++;

            } else {
                sumValuation += valuation;
            }
            if (counterExcluded == 2) {
                System.out.printf("%s has been excluded at %d grade", name, counterExams);
                break;
            }
        }

        if (counterExams == 13 && counterExcluded < 2) {
            sumValuation /= 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, sumValuation);
        }

    }
}
