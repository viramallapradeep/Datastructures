package arrayOne;

import java.util.Arrays;

public class RotateArray {

    public static void main(String[] args) {
		
	/*	case 1
		int a[] = { 1, 2, 3, 4, 5,6,7};
		
		int n = 10 % 7;
		
		
		while(n >= 1) {
			
			
			int temp = a[a.length-1];
			
			for (int i = a.length-2; i >= 0; i--) {
				
				a[i+1] = a[i];
			}
			
			a[0]=temp;
			
			n--;
			
		}
		
		System.out.println(Arrays.toString(a));*/
		
		/*case 2
		 int ar[] = { 1, 2, 3, 4,5};
		 //5 4 3 2 1
		
		int a = 0,z=ar.length-1;
		
		while (a < z) {
			int temp = ar[a];
			ar[a] = ar[z];
			ar[z]=temp;
			a++;
			z--;
		}
		
		System.out.println(Arrays.toString(ar));*/

        int r = 7;
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};

        reverse(a, 0, a.length - 1);
        System.out.println(Arrays.toString(a));

        reverse(a, 0, r - 1);

        System.out.println(Arrays.toString(a));

        reverse(a, r, a.length - 1);

        System.out.println(Arrays.toString(a));

    }


    public static void reverse(int[] a, int i, int j) {

        for (; i < j; i++, j--) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
        }

    }

}
