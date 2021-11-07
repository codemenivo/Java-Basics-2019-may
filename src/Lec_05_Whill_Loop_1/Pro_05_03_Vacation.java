package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Pro_05_03_Vacation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете сумата нужна за екскурзията: ");
        double excursionPrice = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете сумата с която разполага: ");
        double inputSum = Double.parseDouble(scanner.nextLine());

        double currentMoney = 0.0;
        int counterSpendDays = 0;
        int counterAllDays = 0;
        while (inputSum < excursionPrice){
            System.out.print("Въведете вида на действието Spend or Save: ");
            String operationName = scanner.nextLine();
            System.out.print("Въведете сумата, която ще похарче или спести: ");
            currentMoney = Double.parseDouble(scanner.nextLine());

            if ("spend".equalsIgnoreCase(operationName)){
                counterAllDays++;
                counterSpendDays++;
                inputSum -= currentMoney;
                if (inputSum < 0){
                    inputSum = 0.0;
                }
                if (counterSpendDays == 5){
                    break;
                }
            } else {
                counterAllDays++;
                counterSpendDays = 0;
                inputSum += currentMoney;

            }
        }

        if (counterSpendDays == 5){
            System.out.printf("You can't save the money.%n%d", counterAllDays);
        } else {
            System.out.printf("You saved the money for %d days.", counterAllDays);
        }


    }
}
