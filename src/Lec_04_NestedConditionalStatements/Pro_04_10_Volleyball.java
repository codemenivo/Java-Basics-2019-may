package Lec_04_NestedConditionalStatements;

import java.util.Scanner;

public class Pro_04_10_Volleyball {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Въведете каква е годината - високосна (leap) или не (normal): ");
        String typeYear = scanner.nextLine();
        System.out.print("Въведете броя празници в годината, които не са в събота или неделя: ");
        int numFeastDay = Integer.parseInt(scanner.nextLine());
        System.out.print("Въведете броя уикенди, в които Влади си пътува до родния град: ");
        int numTripHometown = Integer.parseInt(scanner.nextLine());

        double voleyDaysInSofiaWeek = (48 - numTripHometown) * 3 / 4.0;
        double voleyInFeastDayInSofia = numFeastDay * 2 /3.0;
        double sumDaysPlayVolley = voleyDaysInSofiaWeek + voleyInFeastDayInSofia + numTripHometown;

        if ("leap".equalsIgnoreCase(typeYear)){
            sumDaysPlayVolley *= 1.15;
            System.out.printf("%.0f", Math.floor(sumDaysPlayVolley));
        } else {
            System.out.printf("%.0f", Math.floor(sumDaysPlayVolley));
        }

    }
}
