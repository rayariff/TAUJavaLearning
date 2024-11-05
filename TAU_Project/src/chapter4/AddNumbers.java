package chapter4;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String []args){
        boolean again;

        do{
            System.out.println("Enter your first number : ");
            Scanner scanner = new Scanner(System.in);
            double num1 = scanner.nextDouble();
            System.out.println("Enter your second number : ");
            double num2 = scanner.nextDouble();

            double sum = num1 + num2;

            System.out.println("Result : "+sum);
            System.out.println("Would you like to run again? True or False");
            again = scanner.nextBoolean();

        }while(again);
    }
}
