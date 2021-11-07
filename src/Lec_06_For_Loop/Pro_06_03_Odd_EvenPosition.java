package Lec_06_For_Loop;

import java.util.Scanner;

public class Pro_06_03_Odd_EvenPosition {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цялочиасло, указващо бр. числа, които ще се четат: ");
        int num = Integer.parseInt(scanner.nextLine());

        double evenSum = 0.0;
        double evenMin = 1000000000.0;
        double evenMax = -1000000000.0;
        double oddSum = 0.0;
        double oddMin = 1000000000.0;
        double oddMax = -1000000000.0;
        for (int index = 1; index <= num ; index++) {

            System.out.print("Въведи число за проверка: ");
            double inputNum = Double.parseDouble(scanner.nextLine());
            if (index % 2 == 0){
                evenSum = evenSum + inputNum;
                if (index == 2 && evenMin > inputNum && evenMax < inputNum){
                    evenMin = inputNum;
                    evenMax = inputNum;

                } else if (inputNum < evenMin){
                    evenMin = inputNum;
                } else if (inputNum > evenMax){
                    evenMax = inputNum;
                }
            } else{
                oddSum = oddSum + inputNum;
                if (index == 1 && oddMin > inputNum && oddMax < inputNum){
                    oddMin = inputNum;
                    oddMax = inputNum;
                } else if (inputNum < oddMin){
                    oddMin = inputNum;
                } else if (inputNum > oddMax){
                    oddMax = inputNum;
                }
            }

        }

        if (num == 0){
            System.out.printf("OddSum=%.2f,%nOddMin=No,%nOddMax=No,%n", oddSum);
            System.out.printf("EvenSum=%.2f,%nEvenMin=No,%nEvenMax=No%n", evenSum);

        } else if (num == 1){
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%n", oddSum, oddMin, oddMax);
            System.out.printf("EvenSum=%.2f,%nEvenMin=No,%nEvenMax=No%n", evenSum);

        } else {
            System.out.printf("OddSum=%.2f,%nOddMin=%.2f,%nOddMax=%.2f,%n", oddSum, oddMin, oddMax);
            System.out.printf("EvenSum=%.2f,%nEvenMin=%.2f,%nEvenMax=%.2f%n", evenSum, evenMin, evenMax);

        }


    }
}
