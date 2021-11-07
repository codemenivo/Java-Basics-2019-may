package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_07_NameWars {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете име на човек: ");
        String inputName = scanner.nextLine();

        int sumMax = 0;
        String nameMax = "";
        while (!"STOP".equals(inputName)){
            int charSum = 0;
            for (int i = 0; i < inputName.length() ; i++) {
                charSum = charSum + (int)(inputName.charAt(i));
            }
            if (charSum > sumMax){
                sumMax = charSum;
                nameMax = inputName;
            }

            System.out.print("Въведете име на човек или STOP: ");
            inputName = scanner.nextLine();
        }

        System.out.printf("Winner is %s - %d!", nameMax, sumMax);

    }
}
