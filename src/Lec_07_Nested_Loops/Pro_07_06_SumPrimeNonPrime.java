package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Pro_07_06_SumPrimeNonPrime {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведедете цяло число или командата STOP: ");
        String command = scanner.nextLine();
        int sumPrime = 0;
        int sumNonPrime = 0;

        while (!"stop".equalsIgnoreCase(command)){
            boolean isPrime = true;
            int num = Integer.parseInt(command);
            if (num < 0){
                System.out.println("Number is negative.");
                System.out.print("Въведедете цяло число или командата STOP: ");
                command = scanner.nextLine();
                continue;
            } else if (num == 0){
                System.out.print("Въведедете цяло число или командата STOP: ");
                command = scanner.nextLine();
                continue;
            } else if (num == 1){
                isPrime = false;
            } else {
                for (int checkPrime = 2; checkPrime <= num/2 ; checkPrime++) {
                    if (num % checkPrime == 0){
                        isPrime = false;
                        break;
                    }

                }
            }

            if (isPrime) {

                sumPrime = sumPrime + num;
            } else {
                sumNonPrime = sumNonPrime + num;
            }

            System.out.print("Въведедете цяло число или командата STOP: ");
            command = scanner.nextLine();
        }

        System.out.printf("Sum of all prime numbers is: %d%n", sumPrime);
        System.out.printf("Sum of all non prime numbers is: %d", sumNonPrime);


    }
}
