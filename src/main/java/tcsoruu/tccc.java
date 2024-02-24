package tcsoruu;

import java.util.Scanner;

public class tccc {
    public static void main(String[] args) {






        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen tc gir");
        String tc = scan.next();

//String le ikinci kısmı yapılabilir

        for (int i = 0; i <= tc.length(); i++) {
            char c = tc.charAt(i);
            if (i<7){
                System.out.print("*");
            }
            else {
                System.out.print(c);
            }

        }










    }
}
