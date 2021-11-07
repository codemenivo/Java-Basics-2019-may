package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Lab_04_04_FruitOrVegetable {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете име на продукт: ");
        String productName = scanner.nextLine();
// "vegetable" са tomato, cucumber, pepper и carrot
        boolean isFruite = "banana".equals(productName) || "apple".equals(productName) ||
                "kiwi".equals(productName) || "cherry".equals(productName) ||
                "lemon".equals(productName) || "grapes".equals(productName);
        boolean isVegetable = "tomato".equals(productName) || "cucumber".equals(productName) ||
                "pepper".equals(productName) || "carrot".equals(productName);

        if (isFruite){
            System.out.println("fruit");
        } else if (isVegetable){
            System.out.println("vegetable");
        } else {
            System.out.println("unknown");
        }

    }
}
