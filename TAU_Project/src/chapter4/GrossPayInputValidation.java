package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
    public static void main(String[] args) {
        int rate = 15;
        int maxHours = 40;

        System.out.println("How many hours did you worked?");
        Scanner scanner = new Scanner(System.in);
        double hourWorked = scanner.nextDouble();

        while (hourWorked > maxHours || hourWorked < 1){
            System.out.println("Invalid Entry, your work hours should be between 1 and 40");
            hourWorked = scanner.nextDouble();
        }
        scanner.close();

        double gross = hourWorked * rate;
        System.out.println("Gross : $"+gross);
    }
}
