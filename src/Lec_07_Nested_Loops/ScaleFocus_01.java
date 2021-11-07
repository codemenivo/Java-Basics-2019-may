package Lec_07_Nested_Loops;

import java.util.Scanner;

public class ScaleFocus_01 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numEgg = Integer.parseInt(scanner.nextLine());

        //if (numEgg % 2 != 0 || numEgg == 10) {
        // System.out.println("No solution");

        // } else {
        if (numEgg % 8 == 0) {
            System.out.println(numEgg / 8);
        } else if (numEgg % 8 == 6) {
            System.out.println(numEgg / 8 + 1);
        } else if (numEgg % 8 == 4) {
            System.out.println((numEgg - 12) / 8 + 2);
        } else if (numEgg % 8 == 2 && numEgg > 10) {
            System.out.println((numEgg - 18) / 8 + 3);
        } else {
            System.out.println("No solution");
        }

    }
}
