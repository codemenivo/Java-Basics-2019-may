package Exam_2019_07_27_28_Kiko;

import java.util.Scanner;

public class Pro_02_Summer_Shoping {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете сума на бюджета: ");
        double budget = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете цена на плажната кърпа: ");
        double towelPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете цяло число за процента отстъпка: ");
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double umbrellaPrice = towelPrice * 2 / 3;
        double sandalsPrice = umbrellaPrice * 0.75;
        double bagPrice = (towelPrice + sandalsPrice) / 3;
        double sumPurchases = towelPrice + umbrellaPrice +
                sandalsPrice + bagPrice;
        double discountSum = sumPurchases * (100 - percentDiscount) /100;
        double diff = Math.abs(budget - discountSum);

        if (budget >= discountSum) {
            System.out.printf("Annie's sum is %.2f lv. She has %.2f lv. left.", discountSum, diff);
        } else {
            System.out.printf("Annie's sum is %.2f lv. She needs %.2f lv. more.", discountSum, diff);
        }

    }
}
