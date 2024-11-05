package chapter2;

import java.util.Scanner;

public class ExcerciseChapter2 {
    public static void main(String []args){
        System.out.println("Input season of the year :");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        System.out.println("Input adjective :");
        String adjective = scanner.next();

        System.out.println("Input a whole number :");
        int wholeNumber = scanner.nextInt();

        System.out.println("On a "+adjective+" "+season
                +" day, i drink a minimum of "+wholeNumber+" cups of coffe");
    }
}
