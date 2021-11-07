package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Lab_05_04_MaxNumber {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на числата, които ще се въвеждат: ");
        int numInput = Integer.parseInt(scanner.nextLine());


        int maxNum = Integer.MIN_VALUE;
        int countNum = 1;
        while (countNum <= numInput){
            System.out.print("Въведете самото число: ");
            int num = Integer.parseInt(scanner.nextLine());
            if (num > maxNum){
                maxNum = num;
            }
            countNum++;

        }
        System.out.printf("%d", maxNum);

    }
}
