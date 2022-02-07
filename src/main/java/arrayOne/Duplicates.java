package arrayOne;

public class Duplicates {


    //case2 O(n)
    static void printRepeating(int[] arr, int size) {
        int i;
        System.out.println("The repeating elements are : ");

        for (i = 0; i < size; i++) {

            int j = Math.abs(arr[i]);

            if (arr[j] >= 0)
                arr[j] = -arr[j];
            else
                System.out.print(j + " ");
        }
    }


    public static void main(String[] args) {

        int[] a = {7, 7, 7, 7, 7, 7, 7, 7};

        printRepeating(a, a.length);


        //case1 O(n2)
        for (int i = 0; i < a.length; i++) {

            int count = 1;

            for (int j = 0; j < a.length; j++) {

                if (i != j && a[i] == a[j]) {
                    count++;
                }
            }

            if (count > 1) {
//				System.out.println(a[i] + " repeated "+ count);

            }
        }


    }

}
