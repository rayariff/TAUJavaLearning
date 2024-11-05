package chapter2;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String []args){
        //1. Get the number of hours worked
        System.out.println("Masukan jumlah jam kerja yang sudah dilakukan :");
        Scanner scanner = new Scanner(System.in);
        int hours = scanner.nextInt();

        //2. Get the hourly pay rate
        System.out.println("Masukan jumlah pay rate :");
        double rate = scanner.nextDouble();

        //3. Multiply hours and pay rate
        double grossPay = hours * rate;

        //4. Display result
        System.out.println("Gaji kotor pegawai adalah Rp. "+grossPay);
        scanner.close();
    }
}
