import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        int count;
        System.out.println("Girilen Sayıya Kadar Olan Çift Sayıları Bulan Program");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Girin : ");
        count = scanner.nextInt();

        //Çift Sayılar
        System.out.println("****************\nGirdiğiniz Sayıya Kadar Olan Çift Sayılar\n******************");
        for(int i = 1; i <= count; i++){
            if(i%2 == 0){
                System.out.println(i);
            }
        }
        System.out.println("****************************");
        int i = 1;
        while(i <= count){
            if(i%3 == 0 && i%4 == 0){
                System.out.println(i);
            }
            i++;
        }
    }
}
