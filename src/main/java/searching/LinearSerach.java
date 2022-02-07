package searching;

public class LinearSerach {

    public static void main(String[] args) {

        int[] a = {12, 234, 23, 2113, 213, 233, 1223, 3, 2, 1};

        int key = 3;
        int index = 0;

        //general case
	/*	for (int i = 0; i < a.length; i++) {
			
			if (key == a[i]) {
				index = i;
			}
			
		}*/


        // best case possible way
        for (int x = 0, y = a.length - 1; x <= y; x++, y--) {

            if (key == a[x]) {
                index = x;
                break;
            } else if (key == a[y]) {
                index = y;
                break;
            }


        }

        System.out.println(index);


    }

}
