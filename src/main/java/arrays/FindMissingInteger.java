package arrays;

public class FindMissingInteger {

    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 6, 3, 7, 8, 5};

        int max = arr[0];

        int arrayTotal = 0;

        for (int i = 0; i < arr.length; i++) {

            arrayTotal += arr[i];

            if (arr[i] > max) {
                max = arr[i];
            }
        }

        int total = 0;

        for (int i = 1; i <= max; i++) {
            total += i;

        }

        int missingInt = total - arrayTotal;

//		System.out.println(missingInt);


        int m = 0;
        boolean flag = false;
        for (int i = 1; i <= max; i++) {
            flag = false;
            for (int j = 0; j < arr.length; j++) {
                if (i == arr[j]) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                m = i;
                break;
            }

        }
//		System.out.println(m);


        int[] arry = {-3, -2, -1, 0, 1, 2, -5, -4};

        int k = arry[0];
        int l = arry[0];

        for (int i = 0; i < arry.length; i++) {


            if (arry[i] > k) {
                k = arry[i];
            }

            if (arry[i] < l) {
                l = arry[i];
            }

        }

        int kkk = 0;

        boolean flag1 = false;

//		System.out.println("ddd "+ k);

        for (int i = l; i <= k; i++) {
            flag1 = false;
            for (int j = 0; j < arry.length; j++) {
                if (i == arry[j]) {
                    flag1 = true;
                    break;
                }
            }

            if (!flag1) {
                kkk = i;
                break;
            }

        }


        System.out.println("asd " + (k));


        int i = 0;

        for (; i < arry.length; i++) {

            if (arry[i] != i + 1) {
                break;
            }

        }

//		System.out.println(i+1);


        //for sorted
        int h = 0;

        while (h < arry.length) {

            if (arry[h] != h + 1) {
                break;
            }

            h++;
        }

//		System.out.println( h);


    }
}
