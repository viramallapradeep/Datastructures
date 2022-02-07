package arrayOne;

import java.util.Arrays;

public class NegetivesPositivesAside {

    public static void main(String[] args) {

//		case1
	/*	int []a= {-2,-3,4,6,7,-6,8,933,-22,-12,112};
		
		int x= 0, y= a.length-1;
		
		while (x<y) {
			
			if (a[x] > 0 && a[y] < 0) {
				int temp = a[x];
				a[x] = a[y];
				a[y]=temp;
				x++;y--;
			}else if((a[x] < 0 && a[y] > 0) ) {
				x++;y--;
			}else if((a[x] > 0 && a[y] > 0) ) {
				y--;
			}else if(a[x] < 0 && a[y] < 0) {
				x++;
			}
			
		}
		System.out.println(Arrays.toString(a));*/

        //case2
        int[] a = {3, -4, -2, -1, -5, -10, 5, -3, 2, -9};

        int p = a.length - 1;
        int i = 0;

        while (i < p) {

            if (a[i] < 0) {
                i++;
            } else {
                if (a[p] < 0) {
                    int temp = a[i];
                    a[i] = a[p];
                    a[p] = temp;
                    i++;
                    p--;
                } else {
                    p--;
                }
            }
        }

        System.out.println(Arrays.toString(a));
    }
}
