package chapter4;

import java.util.Scanner;

public class LetterSearch {
    public static void main(String []args){
        System.out.println("Enter some text : ");
        Scanner scanner = new Scanner(System.in);
        String text = scanner.next();
        scanner.close();

        boolean letterFound = false;
        for(int i=0;i<text.length();i++){
            char currentLetter = text.charAt(i);
            if(currentLetter == 'A' || currentLetter == 'a'){
                letterFound = true;
                break;
            }
        }
        if(letterFound){
            System.out.println("This text contain letter A");
        }
        else {
            System.out.println("This text didn't contain letter A");
        }
    }
}
