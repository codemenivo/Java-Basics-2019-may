package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_03_EvenPowersOf2 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число N за степен до която трябва да проверим: ");
//        int inputNum = Integer.parseInt(scanner.nextLine());
//
//        int result = 1;
//        for (int pow = 0; pow <= inputNum ; pow = pow + 2) {
//
//            System.out.printf("%d%n", result);
//            result = result * 4;
//
//        }

        double inputNum = Double.parseDouble(scanner.nextLine());

        for (double power = 0; power <= inputNum ; power++) {
            if (power % 2 == 0){
                double result = Math.pow(2.0, power);
                System.out.printf("%.0f%n", result);

            }

        }

    }
}
