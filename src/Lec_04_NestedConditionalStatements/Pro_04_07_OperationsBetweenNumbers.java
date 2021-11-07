package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_07_OperationsBetweenNumbers {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете първото цяло число: ");
        int num1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете второто цяло число: ");
        int num2 = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете символ за оператор на действието +, -, *, /, %: ");
        //String operation = scanner.nextLine();
        char operation = scanner.nextLine().charAt(0);



        switch (operation){
            case '+':
                int result = num1 + num2;
                if (result % 2 == 0){
                    System.out.printf("%d %s %d = %d - even", num1, operation, num2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operation, num2, result);
                }
                break;
            case '-':
                result = num1 - num2;
                if (result % 2 == 0){
                    System.out.printf("%d %s %d = %d - even", num1, operation, num2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operation, num2, result);
                }
                break;
            case '*':
                result = num1 * num2;
                if (result % 2 == 0){
                    System.out.printf("%d %s %d = %d - even", num1, operation, num2, result);
                } else {
                    System.out.printf("%d %s %d = %d - odd", num1, operation, num2, result);
                }
                break;
            case '/':
                if (num2 != 0){
                    double dev = num1 * 1.0 / num2;
                    System.out.printf("%d %s %d = %.2f", num1, operation, num2, dev);
                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                }
                break;
            case '%':
                if (num2 != 0){
                    result = num1 % num2;
                    System.out.printf("%d %s %d = %d", num1, operation, num2, result);
                } else {
                    System.out.printf("Cannot divide %d by zero", num1);
                }
                break;

        }

    }
}
