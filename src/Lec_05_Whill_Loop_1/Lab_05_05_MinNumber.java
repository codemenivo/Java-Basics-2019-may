package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Lab_05_05_MinNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на подаваните цели числа: ");
        int numInput = Integer.parseInt(scanner.nextLine());

        int minNum = Integer.MAX_VALUE;
        int counter = 1;
        while (counter <= numInput){
            System.out.print("Въведете цяло число за сравняване: ");
            int num = Integer.parseInt(scanner.nextLine());
            counter++;
            if (num < minNum){
                minNum = num;
            }
        }
        System.out.printf("%d", minNum);

    }
}
