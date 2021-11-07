package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Pro_05_06_Cake {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("въведете дължината на тортата в см: ");
        int lengthCake = Integer.parseInt(scanner.nextLine());
        System.out.print("въведете ширината на тортата в см: ");
        int widthCake = Integer.parseInt(scanner.nextLine());

        int numPiecesOfCake = lengthCake * widthCake;
        boolean isComand = false;
        while (!isComand && numPiecesOfCake >= 0) {
            System.out.print("въведи команда или брой взети парчета: ");
            String inputStr = scanner.nextLine();

            if ("STOP".equals(inputStr)) {
                isComand = true;
            } else {
                int takePieces = Integer.parseInt(inputStr);
                numPiecesOfCake -= takePieces;
                if (numPiecesOfCake < 0) {
                    numPiecesOfCake = Math.abs(numPiecesOfCake);
                    break;
                }
            }
        }

        if (isComand) {
            System.out.printf("%d pieces are left.", numPiecesOfCake);
        } else {
            System.out.printf("No more cake left! You need %d pieces more.", numPiecesOfCake);
        }


    }
}
