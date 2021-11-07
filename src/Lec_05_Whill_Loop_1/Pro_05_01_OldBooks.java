package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Pro_05_01_OldBooks {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете заглавието на търсената книга: ");
        String titleName = scanner.nextLine();
        System.out.print("Въведете броя на книгите налични в библотеката: ");
        int numAllBooks = Integer.parseInt(scanner.nextLine());

        String bookName = "";
        int counter = 0;
        boolean isFound = false;
        while (!isFound && counter < numAllBooks){
            System.out.print("Въведи заглавие за проверка: ");
            bookName = scanner.nextLine();
            if (bookName.equalsIgnoreCase(titleName)){
                isFound = true;
            } else {
                counter++;
            }
        }
        if (isFound){
            System.out.printf("You checked %d books and found it.", counter);
        } else {
            System.out.printf("The book you search is not here!%nYou checked %d books.", counter);
        }

    }
}
