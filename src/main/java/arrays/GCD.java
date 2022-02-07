package arrays;

public class GCD {


    public static void main(String[] args) {


        int[] arr = {2, 3, 60, 90, 50};
        int n1 = 36, n2 = 22;


        //	case 3

        while (true) {
            int m = n1 % n2;
            if (m == 0) {
                break;
            } else {
                n1 = n2;
                n2 = m;
            }
        }

        System.out.println("n1 == " + n1);


        //case 1
        int s = 1, e = 3;
        int gcd = arr[s];
        for (int i = s + 1; i <= e; i++) {
            gcd = name(arr[i], gcd);
        }

        System.out.println(gcd);


        //case 2
        int max = 1;
	/*	for (int i = (n1/2>10?n1/2:n1); i > 1; i--) {
			
			if (n1%i==0 && n2%i==0) {
				
				if(i>max) {
					max=i;
				}
			}
			
		}*/

        System.out.println("max==" + max);


    }

    public static int name(int n2, int n1) {

        while (true) {
            int temp = Math.abs(n2 - n1);
            n2 = n1;
            n1 = temp;

            if (n1 == n2) {
                break;
            }

        }

        return n2;


    }


}