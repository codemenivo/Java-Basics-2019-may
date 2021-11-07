package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_07_PasswordGuess {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете потребителска парола: ");
        String pass = scanner.nextLine();

        if ("s3cr3t!P@ssw0rd".equals(pass)){
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }

    }
}
