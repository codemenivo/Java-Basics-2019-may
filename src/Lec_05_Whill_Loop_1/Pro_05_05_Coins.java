package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Pro_05_05_Coins {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете стойността на рестото в лв: ");
        double inputRest = Double.parseDouble(scanner.nextLine());
        inputRest = Math.floor(inputRest * 100);

        int counter = 0;
        while (inputRest > 0){
            if (inputRest - 200 >= 0){
                inputRest = inputRest - 200;
                counter++;
            } else if (inputRest - 100 >= 0){
                inputRest = inputRest - 100;
                counter++;
            } else if (inputRest - 50 >= 0){
                inputRest = inputRest - 50;
                counter++;
            } else if (inputRest - 20 >= 0){
                inputRest = inputRest - 20;
                counter++;
            } else if (inputRest - 10 >= 0){
                inputRest = inputRest - 10;
                counter++;
            } else if (inputRest - 5 >= 0){
                inputRest = inputRest - 5;
                counter++;
            } else if (inputRest - 2 >= 0){
                inputRest = inputRest - 2;
                counter++;
            } else if (inputRest - 1 >= 0){
                inputRest = inputRest - 1;
                counter++;
            }
        }

        System.out.printf("%d", counter);


    }
}
