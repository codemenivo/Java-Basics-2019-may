package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_07_TrainTheTrainers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на хората в журито: ");
        int jury = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете име на презентация: ");
        String presentationName = scanner.nextLine();

        int counterPresentation = 0;
        double averageevaluationPresentation = 0.0;
        double finalaverageevaluationPresentation = 0.0;
        while (!"Finish".equals(presentationName)){
            double sumevaluationPresentation = 0.0;
            for (int evaluationNum = 1; evaluationNum <= jury ; evaluationNum++) {
                System.out.print("Въведете оценка за презентацията: ");
                double evaluationPresentation = Double.parseDouble(scanner.nextLine());
                sumevaluationPresentation = sumevaluationPresentation + evaluationPresentation;
            }
            averageevaluationPresentation = sumevaluationPresentation / jury;
            finalaverageevaluationPresentation = finalaverageevaluationPresentation + averageevaluationPresentation;
            counterPresentation++;

            System.out.printf("%s - %.2f.%n", presentationName, averageevaluationPresentation);


            System.out.print("Въведете име на презентация или команда Finish: ");
            presentationName = scanner.nextLine();
        }
        finalaverageevaluationPresentation = finalaverageevaluationPresentation / counterPresentation;
        System.out.printf("Student's final assessment is %.2f.", finalaverageevaluationPresentation);

    }
}
