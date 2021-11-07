package Lec_06_For_Loop;

import java.util.Scanner;

public class Lab_06_07_VowelsSum {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете текст: ");
        String inputText = scanner.nextLine();

        int vowelSum = 0;
        //int length = inputText.length(); Вместо отделно да определяме length - направо във цикъла.
        for (int i = 0; i < inputText.length(); i++) {
            //char simbol = inputText.charAt(i); Вместо отделно да вадим символ от текста - направо в Swich
            switch (inputText.charAt(i)){
                case 'a':
                    vowelSum = vowelSum + 1;
                    break;
                case 'e':
                    vowelSum = vowelSum + 2;
                    break;
                case 'i':
                    vowelSum += 3;
                    break;
                case 'o':
                    vowelSum += 4;
                    break;
                case 'u':
                    vowelSum += 5;
                    break;
            }
        }

        System.out.println(vowelSum);


    }
}
