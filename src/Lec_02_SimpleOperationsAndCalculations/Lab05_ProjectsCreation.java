package Lec_02_SimpleOperationsAndCalculations;

import java.util.Scanner;

public class Lab05_ProjectsCreation {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Въведете име на архитект: ");
        String name = scanner.nextLine();
        System.out.print("Въведете брой на проекти: ");
        int numberProjects = Integer.parseInt(scanner.nextLine());
        int hourOfProjects = numberProjects * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s."
                , name, hourOfProjects, numberProjects);


    }
}
