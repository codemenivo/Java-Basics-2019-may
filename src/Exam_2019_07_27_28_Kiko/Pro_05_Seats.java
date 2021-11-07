package Exam_2019_07_27_28_Kiko;

import java.util.Scanner;

public class Pro_05_Seats {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете броя закупени билети: ");
        int ticketsNum = Integer.parseInt(scanner.nextLine());
        String seatNumber = "";

        for (int nextTicket = 1; nextTicket <= ticketsNum; nextTicket++) {
            System.out.print("Въведи номер на билет: ");
            String  codeTicket = scanner.nextLine();
            int lengthCode = codeTicket.length();
            char firstChar = codeTicket.charAt(0);
            char secondChar = codeTicket.charAt(1);
            char thirdChar = codeTicket.charAt(2);
            char fourthChar = codeTicket.charAt(3);

            if (lengthCode == 4 && (firstChar > 'A' && firstChar < 'Z')) {
                System.out.printf("Seat decoded: %s%s%s%n", firstChar, secondChar, thirdChar);
            } else if (lengthCode == 4) {
                System.out.printf("Seat decoded: %s%s%s%n", fourthChar, secondChar,thirdChar);
            } else if (lengthCode == 5 || lengthCode == 6) {
                int asciiSecondChar;
                asciiSecondChar = secondChar;
                System.out.printf("Seat decoded: %s%d%n", firstChar, asciiSecondChar);
            }
        }


    }
}
