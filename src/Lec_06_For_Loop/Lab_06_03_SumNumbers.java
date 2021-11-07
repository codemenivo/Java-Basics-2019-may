package Lec_06_For_Loop;

import java.util.Scanner;

public class Lab_06_03_SumNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число показвщо броя на числата за въвеждане: ");
        int nNumbers = Integer.parseInt(scanner.nextLine());

        int sum = 0;
        for (int i = 1; i <= nNumbers ; i++) {
            System.out.print("Въведете цяло число: ");
            int inputNum = Integer.parseInt(scanner.nextLine());
            sum += inputNum;
        }

        System.out.printf("%d", sum);

    }
}
