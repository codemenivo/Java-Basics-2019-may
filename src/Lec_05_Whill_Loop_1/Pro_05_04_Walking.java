package Lec_05_Whill_Loop_1;

import java.util.Scanner;

public class Pro_05_04_Walking {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberStepsPerDay = 0;
        boolean isGoHome = false;
        while (numberStepsPerDay < 10000){
            System.out.print("Въведете команда или броя на стъките, които изминава при всяко излизане: ");
            String inputInfo = scanner.nextLine();
            if ("Going home".equalsIgnoreCase(inputInfo)){
                System.out.print("Въведи крачките до дома: ");
                int stepsToHome = Integer.parseInt(scanner.nextLine());
                numberStepsPerDay += stepsToHome;
                isGoHome = true;
                break;
            } else {
                int stepsInToDay = Integer.parseInt(inputInfo);
                numberStepsPerDay += stepsInToDay;
            }
        }

        if (isGoHome && numberStepsPerDay < 10000){
            int diff = 10000 - numberStepsPerDay;
            System.out.printf("%d more steps to reach goal.", diff);
        } else {
            System.out.println("Goal reached! Good job!");
        }


    }
}
