package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_08_EqualWords {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първата дума: ");
        String word1 = scanner.nextLine().toLowerCase();
        System.out.print("Въведете втората дума: ");
        String word2 = scanner.nextLine().toLowerCase();

        //if (word1.equalsIgnoreCase(word2)) Вариант без да минава към само малки или големи букви!
        if (word1.equals(word2)){
            System.out.println("yes");
        } else {
            System.out.println("no");
        }

    }
}
