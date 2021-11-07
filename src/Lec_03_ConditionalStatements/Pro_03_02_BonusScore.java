package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Pro_03_02_BonusScore {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число: ");
        int inputNum = Integer.parseInt(scanner.nextLine());

        double bonusScore = 0.0;
        if (inputNum <= 100){
            bonusScore = 5;
        } else if (inputNum > 1000){
            bonusScore = inputNum * 0.1;
        } else {
            bonusScore = inputNum * 0.2;
        }

        if (inputNum % 2 == 0){
            bonusScore += 1;
        } else if (inputNum % 10 == 5){
            bonusScore += 2;
        }

        System.out.printf("%f%n%f", bonusScore, (inputNum + bonusScore));

    }
}
