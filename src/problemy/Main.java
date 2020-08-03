package problemy;

public class Main {

    public static void main(String[] args) {

     /* SUMOWANIE LICZ OD 1 DO N */
        //BigInteger
        int n = 100*100;
        int suma = 0;

        /* sumowanie małe liczby */

        for (int i = 1; i <= n ; i++)
        {
            suma+=i;
            System.out.println(suma);
        }
       System.out.println("sposób I to: " + suma);

        //-------------------------------------------------
        //1+2+3+4+5+6+7+8+9+10+11+12
        // 1  n
        //--------
        // 1  12
        //2   11
        //3   10
        //4   9
        //5   8
        //6   7
        //-------------------------------------------------

        /* sumowanie duże liczby */

        if (n % 2 == 0) {
            suma = (n/2)*(n+1);
        }else {
            suma = (n+1)/(2*n);
        }
        System.out.println("sposób II to: " + suma);
    }
}
