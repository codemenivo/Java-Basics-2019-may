package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Lab_05_08_Moving {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете широчина на свободното място - цялочисло: ");
        int widthFreeSpace = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете дължина на свободното място - цялочисло: ");
        int lengthFreeSpace = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете височина на свободното място - цялочисло: ");
        int hightFreeSpace = Integer.parseInt(scanner.nextLine());

        int roomVolume = widthFreeSpace * lengthFreeSpace * hightFreeSpace;
        int sumVolumBoxes = 0;
        String input = "";
        while (sumVolumBoxes <= roomVolume){
            System.out.print("Въведете брой кашони с обем 1м/3 които пренася или команда: ");
            input = scanner.nextLine();

            if ("Done".equalsIgnoreCase(input)){
                break;
            }
            int boxesNum = Integer.parseInt(input);
            if (sumVolumBoxes <= roomVolume) {
                sumVolumBoxes += boxesNum;
            }
        }
        int diff = Math.abs(roomVolume - sumVolumBoxes);
        if (sumVolumBoxes > roomVolume){
            System.out.printf("No more free space! You need %d Cubic meters more.", diff);
        } else {
            System.out.printf("%d Cubic meters left.", diff);
        }

    }
}
