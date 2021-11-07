package Exam_2019_07_27_28_Kiko;

import java.util.Scanner;

public class Pro_04_Dars_Tournament {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първоначалния брой точки: ");
        int startScore = Integer.parseInt(scanner.nextLine());

        int countShotNumber = 0;

        while (startScore > 0) {
            System.out.print("Въведи име на улучена секция: ");
            String section = scanner.nextLine();
            countShotNumber++;
            if ("bullseye".equals(section)) {
                System.out.printf("Congratulations! You won the game with a bullseye in %d moves!", countShotNumber);
                break;
            }
            System.out.print("Въведи точките на улъчената секция: ");
            int currentPoints = Integer.parseInt(scanner.nextLine());
            switch (section) {
                case "number section":
                    startScore -= currentPoints;
                    break;
                case "double ring":
                    startScore -= (currentPoints * 2);
                    break;
                case "triple ring":
                    startScore -= (currentPoints * 3);
                    break;
            }
        }

        if (startScore == 0) {
            System.out.printf("Congratulations! You won the game in %d moves!", countShotNumber);
        } else if (startScore < 0){
            System.out.printf("Sorry, you lost. Score difference: %d.", Math.abs(startScore));
        }


    }
}
