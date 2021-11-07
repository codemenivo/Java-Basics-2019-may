package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Lab_05_02_Sequence2kPlus1 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете число, което до което да достигне редицата: ");
        int inputNum = Integer.parseInt(scanner.nextLine());

        int currentNum = 1;
        while (currentNum <= inputNum){
            System.out.printf("%d%n", currentNum);
            currentNum = (2 * currentNum) + 1;
        }

    }
}
