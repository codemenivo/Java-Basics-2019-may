package Lec_07_Nested_Loops;

import java.util.Scanner;

public class Lab_07_05_Building {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете цяло число за броя на етажите: ");
        int floorNum = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете цяло число за броя на стаите: ");
        int roomNum = Integer.parseInt(scanner.nextLine());

        for (int floor = floorNum; floor >= 1 ; floor--) {
            for (int room = 0; room < roomNum; room++) {
                if (floor == floorNum){
                    System.out.printf("L%d%d ", floorNum, room);
                } else if (floor % 2 != 0){
                    System.out.printf("A%d%d ", floor, room);
                } else {
                    System.out.printf("O%d%d ", floor, room);
                }

            }
            System.out.println();

        }

    }
}
