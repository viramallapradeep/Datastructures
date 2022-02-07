package arrayOne;

import java.util.Arrays;

public class MinimumPlatforms {

    public static void main(String[] args) {

        int[] a = {900, 940, 950, 1100, 1500, 1800};

        int[] d = {910, 1200, 1120, 1130, 1900, 2000};

//	int a[]=	  {50, 120, 200,550,700,850};
//	int	d[] = {500, 550, 600,700,900,1000};
        int count = 0;

//	case 2
//        {900,  940,  950,  1100,   1500,  1800};
//        {910, 1120, 1130, 1200, 1900, 2000};

        Arrays.sort(a);
        Arrays.sort(d);

        int i = 0, j = 0, pf = 1;

        while (i < a.length) {

            if (a[i] > d[j]) {
                j++;
            } else {
                pf++;
            }

            i++;


        }

        System.out.println(pf);


    }

}
