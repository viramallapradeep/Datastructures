package searching;

public class BinarySearchRecursion {


    public static int binarySearch(int[] a, int key, int low, int high) {

        int mid = (low + high) / 2;

        if (low > high)
            return -1;

        if (key == a[mid]) {
            return mid;
        } else if (key > a[mid]) {
            return binarySearch(a, key, mid + 1, high);
        } else {
            return binarySearch(a, key, low, mid - 1);
        }


    }

    public static void main(String[] args) {

        int[] a = {2, 32, 45, 67, 68, 89, 99, 234, 23456};

        int low = 0, high = a.length - 1;

        System.out.println(binarySearch(a, 22, low, high));

    }

}
