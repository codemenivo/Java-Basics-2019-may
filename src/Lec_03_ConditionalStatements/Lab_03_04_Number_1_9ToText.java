package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_04_Number_1_9ToText {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведи цяло число от 1 до 9 вкл: ");
        int inputNum = Integer.parseInt(scanner.nextLine());

        if (1 == inputNum){
            System.out.println("one");
        } else if (2 == inputNum) {
            System.out.println("two");
        } else if (3 == inputNum){
            System.out.println("three");
        } else if (4 == inputNum){
            System.out.println("four");
        } else if (5 == inputNum){
            System.out.println("five");
        } else if (6 == inputNum){
            System.out.println("six");
        } else if (7 == inputNum){
            System.out.println("seven");
        } else if (8 == inputNum){
            System.out.println("eight");
        } else if (9 == inputNum){
            System.out.println("nine");
        } else {
            System.out.println("number too big");
        }

    }
}
