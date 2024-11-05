package chapter3;

import java.util.Scanner;

public class ExcerciseChapter2 {
    public static void main(String []args){
        int duaRatus = 200;
        int limaRatus = 500;
        int seRibu = 1000;
        int duaRibu = 2000;
        int winScore = 10000;

        System.out.println("Ada berapa duaRatus : ");
        Scanner scanner = new Scanner(System.in);
        int jumlahDuaRatus = scanner.nextInt();
        System.out.println("Ada berapa limaRatus : ");
        int jumlahLimaRatus = scanner.nextInt();
        System.out.println("Ada berapa seRibu : ");
        int jumlahSeRibu = scanner.nextInt();
        System.out.println("Ada berapa duaDibu : ");
        int jumlahDuaRibu = scanner.nextInt();

        jumlahDuaRatus = duaRatus * jumlahDuaRatus;
        jumlahLimaRatus = limaRatus * jumlahLimaRatus;
        jumlahSeRibu = seRibu * jumlahSeRibu;
        jumlahDuaRibu = duaRibu * jumlahDuaRibu;

        int jumlah = jumlahDuaRatus + jumlahLimaRatus + jumlahSeRibu + jumlahDuaRibu;

        if(jumlah == winScore){
            System.out.println("Total uang anda "+jumlah+". Anda memenangkan permainan!");
        } else if (jumlah <= winScore) {
            int kekurangan = winScore - jumlah;
            System.out.println("Anda memiliki uang "+jumlah+". Anda memiliki kekurangan "+kekurangan);
        }
        else {
            int kelebihan = jumlah - winScore;
            System.out.println("Anda memiliki uang "+jumlah+". Anda memiliki kelebihan "+kelebihan);
        }
    }
}
