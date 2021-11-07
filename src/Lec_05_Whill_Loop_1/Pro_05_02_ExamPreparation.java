package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Pro_05_02_ExamPreparation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя незадоволителни оценки, които може да получи: ");
        int inputNumPoorGrade = Integer.parseInt(scanner.nextLine());


        String currentText = "";
        String lastProblem = "";
        int counterPoorGrade = 0;
        int countGoodGrade = 0;
        int goodGrade = 0;
        boolean isEnough = false;
        while (counterPoorGrade < inputNumPoorGrade) {
            System.out.print("Въведете име на задачата или команда Enough: ");
            currentText = scanner.nextLine();


            if ("Enough".equals(currentText)) {
                isEnough = true;
                break;
            }
            System.out.print("Въведете получена оценка за задачата: ");
            int problemGrade = Integer.parseInt(scanner.nextLine());

            goodGrade += problemGrade;
            lastProblem = currentText;
            countGoodGrade++;

            if (problemGrade <= 4) {
                counterPoorGrade++;
            }
        }

        if (isEnough) {
            double averageGrade = goodGrade * 1.0 / countGoodGrade;
            System.out.printf("Average score: %.2f%nNumber of problems: %d%nLast problem: %s", averageGrade, countGoodGrade, lastProblem);
        } else {
            System.out.printf("You need a break, %d poor grades.", counterPoorGrade);
        }


    }
}
