package searching;

public class BinarySearchIterative {

    public static void main(String[] args) {

        int[] a = {23, 45, 67, 88, 98, 564, 890, 997, 7777};

        int low = 0, high = a.length - 1;


        int key = 23;

        while (low <= high) {

            int mid = (low + high) / 2;
            if (key == a[mid]) {
                System.out.println("key is at index " + mid);
                return;
            } else if (key < a[mid]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }

        }

        System.out.println("key not found");

    }

}
