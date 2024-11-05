package chapter4;

import java.util.Random;

public class ExcerciseChapter4 {
    public static void main(String []args){
        int lastSpace = 20;
        int currentSpace = 0;
        int maxRoll = 5;
        Random random = new Random();

        System.out.println("Welcome to the roll dice Game! Lets begin...");

        for(int i=1; i<=maxRoll; i++){
            int die = random.nextInt(6)+1;
            currentSpace = currentSpace + die;
            System.out.printf("Roll #%d: You've rolled %d. ",i,die);

            if (currentSpace == lastSpace){
                System.out.println("You're on space "+currentSpace+". Congrats, you win!");
                break;
            }
            else if(currentSpace > lastSpace){
                System.out.println("Unfortunately, that takes you past "+lastSpace+"spaces. You lose!");
                break;
            }
            else if(i==maxRoll && currentSpace < lastSpace){
                System.out.println("You're on space "+currentSpace+".");
                System.out.println("Unfortunately you didn't make to all "+lastSpace+"spaces. You lose!");
            }
            else {
                int spaceToGo = lastSpace - currentSpace;
                System.out.println("You are now on space "+currentSpace+" and have "+spaceToGo+" more to go.");
            }
            System.out.println();
        }
    }
}
