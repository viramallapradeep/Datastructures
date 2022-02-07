package arrayOne;

import java.util.Arrays;

public class AlternatePositiveNegetive {

    public static void main(String[] args) {

//		case 1 
		/*int a[] = {-9, -4, 2, -1, -5,   -10, 5, -3, 2,-3};
		
		int x= 0, y= a.length-1;
		
		while (x<y) {
			
			if (x%2 == 0 && a[x] < 0   &&  a[y] >= 0) {
				int temp = a[x];
				a[x] = a[y];
				a[y]=temp;
				x++;
			}else if(x%2 == 1 && a[x] >= 0  && a[y] < 0 ) {
				int temp = a[x];
				a[x] = a[y];
				a[y]=temp;
				x++;
			}else if(x%2 == 0 && a[x] >= 0 ) {
				x++;
			}else if(x%2 == 1 && a[x] < 0) {
				x++;
			}else {
				y--;
			}
			
		}
		
		System.out.println(Arrays.toString(a));*/


        int[] a = {-3, 4, 2, -1, -5, -10, 5, -3, 2, 9};

        int j = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                int temp = a[i];
                a[i] = a[j];
                a[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(a));

        int x = 0;


        while (j < a.length && x < j) {
            int temp = a[j];
            a[j] = a[x];
            a[x] = temp;
            x += 2;
            j++;
        }

        System.out.println(Arrays.toString(a));
    }

}
