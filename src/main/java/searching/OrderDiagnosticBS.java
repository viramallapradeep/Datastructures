package searching;

public class OrderDiagnosticBS {


    public static int binarySearch(int[] a, int l, int h, int key) {

        if (a.length == 0)
            return -1;

        boolean isAsc = a[0] < a[h];

        while (l <= h) {

            int mid = (l + h) / 2;

            if (key == a[mid])
                return mid;

            if (isAsc) {

                if (key > a[mid]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }
            } else {

                if (key < a[mid]) {
                    l = mid + 1;
                } else {
                    h = mid - 1;
                }

            }
        }
        return -1;

    }


    public static void main(String[] args) {

        int[] a = {23, 45, 67, 88, 98, 564, 890, 997, 7777};

//		int[] a = {88,55,33,22,-6,-55,-987};

        System.out.println(binarySearch(a, 0, a.length - 1, 7777));
    }

}
