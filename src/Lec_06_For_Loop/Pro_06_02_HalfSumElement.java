package Lec_06_For_Loop;

import java.util.Scanner;

public class Pro_06_02_HalfSumElement {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число за общ бр.на числата, които ще се четат: ");
        int number = Integer.parseInt(scanner.nextLine());

        int sumInputNum = 0;
        int maxNum = Integer.MIN_VALUE;
        for (int i = 1; i <= number ; i++) {
            System.out.print("Въведете цяло число за проверка: ");
            int inputNum = Integer.parseInt(scanner.nextLine());

            sumInputNum += inputNum;
            if (inputNum > maxNum){
                maxNum = inputNum;
            }

        }

        sumInputNum = sumInputNum - maxNum;
        if (sumInputNum == maxNum){
            System.out.printf("Yes%nSum = %d", maxNum);
        } else {

            int diff = Math.abs(maxNum - sumInputNum);
            System.out.printf("No%nDiff = %d", diff);
        }


    }
}
