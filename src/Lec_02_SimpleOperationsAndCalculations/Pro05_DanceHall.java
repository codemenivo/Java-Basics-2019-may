package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Pro05_DanceHall {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете дължината на залата в метри L: ");
        double lengthHall = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете ширината на залата в метри W: ");
        double widthHall = Double.parseDouble(scanner.nextLine());
        System.out.print("Въведете дължина на страната на гардероба в метри A: ");
        double sideSquare = Double.parseDouble(scanner.nextLine());

        double areaHallInCantimetersSquare = (lengthHall * 100) * (widthHall * 100);
        double areaWardrobe = Math.pow(sideSquare * 100, 2);
        double areaBanch = areaHallInCantimetersSquare / 10;
        double freeAreaHall = areaHallInCantimetersSquare - (areaWardrobe + areaBanch);

        double numDancers = freeAreaHall / (40 + 7000);
        System.out.printf("%.0f", Math.floor(numDancers));

    }
}
