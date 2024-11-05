package chapter3;

import java.util.Scanner;

/*
 * NESTED IFS:
 * To qualify for a loan, a person must make at least $30,000
 * and have been working at their current job for at least 2 years.
 */
public class LoanQualifier {
    public static void main(String []args){
        //Initialize what we know
        int requiredSalary = 30000;
        int requiredYear = 2;

        //Get what we don't
        System.out.println("Gaji saat ini : ");
        Scanner scanner = new Scanner(System.in);
        double salary = scanner.nextDouble();

        System.out.println("Total pengalaman kerja (Tahun) : ");
        double years = scanner.nextDouble();

        scanner.close();

        //Make decision
        if(salary >= requiredSalary){
            if(years >= requiredYear){
                System.out.println("Selamat kamu berkualifikasi untuk pinjaman");
            }
            else {
                System.out.println("Maaf kamu perlu bekerja selama "+requiredYear+" tahun");
            }
        }
        else{
            System.out.println("Maaf kamu perlu bekerja selama "+requiredYear+" tahun, dan memiliki " +
                    "gaji minimal "+requiredSalary);
        }
    }
}
