package arrayOne;

import java.math.BigInteger;
import java.util.Arrays;

public class LargestPossibleNumber {


    public static void main(String[] args) {

        String[] a = {"9324", "2324", "32342", "13424324", "9867867"};

//		{9,3,0,1}
//		{9,3,0,1}
//		{9,3,1,0}
//		{9,0,3,1}
//		{9,0,3,1}
//		{9,0,3,1}


        for (int i = 0; i < a.length; i++) {
            String x = a[i];

            for (int j = i + 1; j < a.length; j++) {

                String y = a[j];

                BigInteger n1 = new BigInteger(x + y);

                BigInteger n2 = new BigInteger(y + x);

                System.out.println(Arrays.toString(a));

                if (n2.compareTo(n1) == 1) {
                    String temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }

        }

        String n = "";

        for (int i = 0; i < a.length; i++) {
            n += a[i];
        }

        System.out.println(n);

    }

}
