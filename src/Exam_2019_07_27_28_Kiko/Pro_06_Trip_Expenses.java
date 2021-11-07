package Exam_2019_07_27_28_Kiko;

        import java.util.Scanner;

public class Pro_06_Trip_Expenses {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя на дните за ваканция: ");
        int holidaysNum = Integer.parseInt(scanner.nextLine());

        double moneyLeft = 60.0;

        for (int countDay = 1; countDay <= holidaysNum; countDay++) {

            int purchaseCount = 0;

            while (moneyLeft != 0) {
                System.out.print("Въведи Day over или стойност на покупката: ");
                String infoText = scanner.nextLine();
                if ("Day over".equals(infoText)) {
                    System.out.printf("Money left from today: %.2f. " +
                            "You've bought %d products.%n", moneyLeft, purchaseCount);
                    break;
                } else {
                    int singlePrice = Integer.parseInt(infoText);
                    double currentMoneyLeft = moneyLeft;
                    currentMoneyLeft -= singlePrice;
                    if (currentMoneyLeft < 0) {
                        currentMoneyLeft = moneyLeft;
                    } else {
                        moneyLeft = currentMoneyLeft;
                        purchaseCount++;
                        if (moneyLeft == 0) {

                            System.out.printf("Daily limit exceeded! " +
                                    "You've bought %d products.%n", purchaseCount);
                        }
                    }

                }

            }

            moneyLeft += 60.0;

        }



    }
}
