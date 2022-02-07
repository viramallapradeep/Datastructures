package arrayOne;

import java.util.Arrays;

public class AlternatePositiveNegetive3 {


    public static void main(String[] args) {


        int[] a = {-3, 44, -4, 5, 6, 5, 46, -47, 4, -8, 7};


        int pop = -1, x = 0;

        int nop = -1, y = 1;

        while (x < a.length /*|| y < a.length*/) {


            if (x < a.length) {

                if (pop != -1) {

                    if ((a[x] >= 0)) {
                        rotateArray(a, pop, x);
                        x = pop + 2;
                        pop = -1;
                    }
                }

                if (pop == -1 && (x % 2 == 0 && a[x] < 0)) {
                    pop = x;
                } else {
                    x++;
                }
            }
		
	/*		
		if (y < a.length) {
			
			if (nop !=- 1) {
				if ((a[y] < 0))  {
					rotateArray(a,nop,y);
					
					 y = nop+2;
					 if (y >= a.length) {
						 y = a.length-1;  
					}
					
					 nop = -1;
				}
			
		}
			
		
			
			if (nop == -1 && (y%2 == 1 && a[y] >= 0) ) {
				nop = y;
			}else {
				y++;
			}
		}*/

        }


        System.out.println(Arrays.toString(a));

    }

    private static void rotateArray(int[] a, int op, int x) {

        int temp = a[x];

        for (int i = x; i > op; i--) {

            a[i] = a[i - 1];
        }

        a[op] = temp;


    }
}

