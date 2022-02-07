package arrayOne;

import java.util.Arrays;

public class MinimumPlatforms2 {

    public static void main(String[] args) {

        int[] a = {900, 940, 950, 1100, 1500, 1800};
        int[] d = {910, 1200, 1120, 1130, 1900, 2000};

//	int a[]=	  {50, 120, 200,550,700,850};
//	int	d[] = {500, 550, 600,700,900,1000};
        int count = 0;

//	case 1
        Arrays.sort(a);
        Arrays.sort(d);

        for (int i = 0, j = 0; i < d.length; i++, j++) {
            int eTemp = 0;
            if (d[j] < 0) {
                continue;
            } else {
                eTemp = d[j];
            }
            for (int x = 0, y = 0; x < d.length; x++, y++) {

                if (eTemp >= 0 && i != x && a[x] > eTemp) {
                    eTemp = d[y];
                    a[x] = -1;
                    d[y] = -1;
                }
            }

            a[i] = -1;
            d[j] = -1;
            count++;
        }


        System.out.println(count);


    }

}
