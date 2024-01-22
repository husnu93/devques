package developersorular;

import java.util.Scanner;

public class faktoriyelalma {
    public static void main(String[] args) {

        Scanner sayi = new Scanner(System.in);
        System.out.println("lütfen faktoriyel alınmasını istedigin sayiyi gir");

        int sonuc = 1 ;
        int scan = sayi.nextInt();
        for (int i=1; i <= scan; i++) {
            sonuc = sonuc*i;
            
            
        }
        System.out.println(sonuc);




    }
}
