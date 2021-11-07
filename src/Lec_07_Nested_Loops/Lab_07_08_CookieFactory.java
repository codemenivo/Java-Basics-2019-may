package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_08_CookieFactory {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число за броя на партидите, които ше се приготвят: ");
        int batch = Integer.parseInt(scanner.nextLine());


        boolean flour = false;
        boolean eggs = false;
        boolean sugar = false;
        for (int batchIndex = 1; batchIndex <= batch; batchIndex++) {

            System.out.print("Въведете използваните продукти за приготвяне на бисквитите: ");
            String productName = scanner.nextLine();

            while (!"Bake!".equals(productName)) {
                switch (productName) {
                    case "flour":
                        flour = true;
                        break;
                    case "eggs":
                        eggs = true;
                        break;
                    case "sugar":
                        sugar = true;
                        break;
                }


                System.out.print("Въведи следващо име на продукт или Bake!: ");
                productName = scanner.nextLine();
            }

            if (flour && eggs && sugar) {
                System.out.printf("Baking batch number %d...%n", batchIndex);
                flour = false;
                eggs = false;
                sugar = false;
            } else {
                System.out.println("The batter should contain flour, eggs and sugar!");
                batchIndex--;
            }

        }

    }
}
