package chapter5;

import java.util.Scanner;

public class ExcerciseChapter5 {
    static double charge = 2500;
    static int tax = (15/100);
    static Scanner scanner = new Scanner(System.in);

    public static void main(String []args){
        double basePlan = basePlanCost();
        double overageFees = getOverageFees();
        double taxTotalFees = taxTotal(basePlan);
        finalTotal(basePlan, overageFees, taxTotalFees);
    }
    public static double basePlanCost(){
        System.out.println("Enter the base plan : ");
        double basePlan = scanner.nextDouble();
        return basePlan;
    }

    public static double getOverageFees(){
        System.out.println("Enter your overage minutes : ");
        int overageMinutes = scanner.nextInt();
        double overageFees = overageMinutes * charge;
        return overageFees;
    }
    public static double taxTotal(double basePlan){
       double taxTotalFees =  basePlan*((double) 15 /100);
       return taxTotalFees;
    }
    public static void finalTotal(double basePlan, double overageFees, double taxTotalFees){
        double finalTotalFees = basePlan+overageFees+taxTotalFees;
        System.out.println("Phone Bill Statement");
        System.out.println("Base Plan : "+basePlan);
        System.out.println("Overage Fees : "+overageFees);
        System.out.println("Tax Fees : "+taxTotalFees);
        System.out.println("Total Fees : "+finalTotalFees);
    }
}
