package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Lab_04_01_PersonalTitles {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете число за години: ");
        double age = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведетв инициал за жена F или за мъж M: ");
        String letter = scanner.nextLine();

        String answer = "";

        if (age >= 16) {
            if ("f".equals(letter)){
                answer = "Ms.";
            } else if ("m".equals(letter)){
                answer = "Mr.";

            }

        } else {
            if ("f".equals(letter)){
                answer = "Miss";
            } else if ("m".equals(letter)){
                answer = "Master";
            }
        }
        System.out.println(answer);

    }
}
