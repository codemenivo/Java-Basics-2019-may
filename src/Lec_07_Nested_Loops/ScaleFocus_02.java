package Lec_07_Nested_Loops;

import java.util.Scanner;

public class ScaleFocus_02 {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String[] parts = name.split(" ");
        int volume = Integer.parseInt(parts[0]);
        int fish = Integer.parseInt(parts[1]);

        if (volume < fish * 3){
            int fishDiff = fish - volume / 3;
            System.out.printf("Yes %d", fishDiff);
        } else {
            System.out.println("No");
        }


    }
}
