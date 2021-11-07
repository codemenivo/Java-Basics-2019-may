package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_09_OnTimeForTheExam {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете часа на изпита: ");
        int examHour = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете минутите на изпита: ");
        int examMinutes = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете часа на пристигане: ");
        int arriveHour = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете минутите на пристигане: ");
        int arriveMinutes = Integer.parseInt(scanner.nextLine());

        int examTimeInMinutes = (examHour * 60) + examMinutes;
        int arriveTimeInMinutes = (arriveHour * 60) + arriveMinutes;
        String statementsStudent = "";
        int differenceTime = Math.abs(arriveTimeInMinutes - examTimeInMinutes);

        if (arriveTimeInMinutes > examTimeInMinutes){
            statementsStudent = "Late";
            if (differenceTime < 60){
                System.out.printf("%s%n%d minutes after the start", statementsStudent, differenceTime);
            } else {
                int hours = differenceTime / 60;
                int minutes = differenceTime % 60;
                System.out.printf("%s%n%d:%02d hours after the start", statementsStudent, hours, minutes);
            }

        } else if (arriveTimeInMinutes < (examTimeInMinutes - 30)){
            statementsStudent = "Early";
            if (differenceTime < 60){
                System.out.printf("%s%n%d minutes before the start", statementsStudent, differenceTime);
            } else {
                int hours = differenceTime / 60;
                int minutes = differenceTime % 60;
                System.out.printf("%s%n%d:%02d hours before the start", statementsStudent, hours, minutes);
            }

        } else {
            statementsStudent = "On time";
            if (differenceTime == 0){
                System.out.printf("%s", statementsStudent);
            } else {
                System.out.printf("%s%n%d minutes before the start", statementsStudent, differenceTime);
            }

        }

    }
}
