package Lec_03_ConditionalStatements;

import java.util.Scanner;

public class Lab_03_11_AnimalType {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете вига на животното - dog, crocodile, tortoise, snake: ");
        String animalType = scanner.nextLine();

        switch (animalType){
            case "dog":
                System.out.println("mammal");
                break;
            case "crocodile":
            case "tortoise":
            case "snake":
                System.out.println("reptile");
                break;
            default:
                System.out.println("unknown");
                break;
        }

    }
}
