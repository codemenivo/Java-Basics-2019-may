package Exam_2019_07_27_28_Kiko;

import java.util.Scanner;

public class Pro_01_Siving_Money {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете сума на месечен доход на Деси: ");
        double monthlyIncome = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете броя месеци, които ще спестява: ");
        int numMonth = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете сумата за месечни разходи на Деси: ");
        double monthlyExpense = Double.parseDouble(scanner.nextLine());

        double extraExpenseForMonth = monthlyIncome * 0.3;
        double savingMoneyForMonth = monthlyIncome - (monthlyExpense + extraExpenseForMonth);
        double allSaving = savingMoneyForMonth * numMonth;
        double percentSaveMoneyForeMonth = savingMoneyForMonth * 100 / monthlyIncome;

        System.out.printf("She can save %.2f%%%n", percentSaveMoneyForeMonth);
        System.out.printf("%.2f", allSaving);

    }
}
