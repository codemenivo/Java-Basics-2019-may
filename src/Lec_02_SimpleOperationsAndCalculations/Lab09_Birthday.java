package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab09_Birthday {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете дължината на аквариума в см.: ");
        double length = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете широчината на аквариума в см.: ");
        double width = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете височината на аквариума в см.: ");
        double hight = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете процента на заетия обем на аквариума: ");
        double percent = Double.parseDouble(scanner.nextLine());

        double volumeDecimeter = length * width * hight * 0.001;
        double freeVolume = volumeDecimeter * (1 - (percent / 100));

        System.out.printf("%.3f", freeVolume);

    }
}
