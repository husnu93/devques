package developersorular;

import java.util.Scanner;

public class basamakdegeritoplama {
    public static void main(String[] args) {
        Scanner sayi = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sum=sayi.nextInt();

        int toplam = 0;

        for (int i =sum ; i > 0 ; i= i/10) {

            toplam= toplam+i%10;



        }


        System.out.println(toplam);


    }
}
