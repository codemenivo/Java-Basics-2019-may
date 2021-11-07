package Lec_06_For_Loop;

import java.util.Scanner;

public class Pro_06_07_Salary {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя отворени табове: ");
        int tabs = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете сумата на заплатата: ");
        int salary = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        for (int indexTabs = 1; indexTabs <= tabs ; indexTabs++) {
            System.out.print("Въведете името на отворения таб: ");
            String nameTab = scanner.nextLine();
            switch (nameTab){
                case "Facebook":
                    salary -= 150;
                    break;
                case "Instagram":
                    salary -= 100;
                    break;
                case "Reddit":
                    salary -= 50;
            }

            if (salary <= 0){
                flag = true;
                break;
            }
        }

        if (flag){
            System.out.println("You have lost your salary.");
        } else {
            System.out.printf("%d", salary);
        }

    }
}
