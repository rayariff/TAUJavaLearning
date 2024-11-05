package chapter3;

import java.util.Scanner;

/*
 * SWITCH
 * Have a user enter their letter grade, and using a switch statement,
 * print out a message letting them know how they did.
 */
public class GradeMessage {
    public static void main(String []args){
        System.out.println("Masukan grade : ");
        Scanner scanner = new Scanner(System.in);
        String grade = scanner.next();
        scanner.close();

        String message;
        switch(grade){
            case "A":
                message = "Excellent Job!";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job!";
                break;
            case "D":
                message = "You need work harder!";
                break;
            case "E":
                message = "Uh Oh!";
                break;
            default:
                message = "Error, invalid grade!";
                break;
        }
        System.out.println(message);
    }
}
