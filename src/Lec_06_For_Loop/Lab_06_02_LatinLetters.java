package Lec_06_For_Loop;

import java.util.Scanner;

public class Lab_06_02_LatinLetters {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

   /*     for (char simbol = 97; simbol <= 122 ; simbol++) {
            System.out.println(simbol);
*/
        for (char letter = 'a'; letter <= 'z' ; letter++) {
            System.out.printf("%s%n", letter);
        }

    }
}
