public class MDARRAYDENEME {
    public static void main(String[] args) {
        int ages[][] = {{15, 4}, {12, 43, 21}};

       int minx  = ages[0][0] ;
       int maxy = ages[0][0];

        for (int[] w : ages
             ) {
            for (int k : w
                 ) {

                maxy = Math.max(maxy,k);
               minx =  Math.min(minx,k);




            }

        }


        System.out.println(minx+maxy);

    }
}
