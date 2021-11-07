package Lec_06_For_Loop;

import java.util.Scanner;

public class Pro_06_04_EqualPairs {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число N показващо броя на двойките числа: ");
        int num = Integer.parseInt(scanner.nextLine());


        int maxDiff = 0;
        int lastsum = 0;

        for (int indexNum = 1; indexNum <= num; indexNum++) {


            System.out.print("Въведете едното цяло число от двойката числи: ");
            int currentNumber1 = Integer.parseInt(scanner.nextLine());
            System.out.print("Въведете другото цяло число от двойката числа: ");
            int currentNumber2 = Integer.parseInt(scanner.nextLine());
            int currentSum = currentNumber1 + currentNumber2;

            if (indexNum > 1) {

                if (currentSum != lastsum) {
                    int diff = Math.abs(currentSum - lastsum);
                    if (diff > maxDiff) {
                        maxDiff = diff;
                    }
                }

            }
            lastsum = currentSum;

        }

        if (maxDiff == 0){
            System.out.printf("Yes, value=%d", lastsum);
        } else {
            System.out.printf("No, maxdiff=%d", maxDiff);
        }


    }
}
