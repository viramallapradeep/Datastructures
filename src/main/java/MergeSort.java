public class MergeSort {


    public static void mergeSort(int[] array) {

        if (array == null) {
            return;
        }

        if (array.length > 1) {

            int mid = array.length / 2;

            // Split left part

            int[] left = new int[mid];

            for (int i = 0; i < mid; i++) {
                left[i] = array[i];
            }

            // Split right part

            int[] right = new int[array.length - mid];

            for (int i = mid; i < array.length; i++) {
                right[i - mid] = array[i];
            }

            mergeSort(left);
            mergeSort(right);

            int i = 0;
            int j = 0;
            int k = 0;

            // Merge left and right arrays

            while (i < left.length && j < right.length) {

                if (left[i] < right[j]) {
                    array[k++] = left[i++];
                } else {
                    array[k++] = right[j++];
                }
            }

            // Collect remaining elements

            while (i < left.length) {
                array[k++] = left[i++];
            }

            while (j < right.length) {
                array[k++] = right[j++];
            }
        }
    }

    // Driver program to test above functions.

    public static void main(String[] args) {
        int[] arr = {122, 3, 5, 1, 24, 77, 88, 12, 4};
        int i = 0;
        System.out.println("Given array is");

        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

        mergeSort(arr);

        System.out.println("\n");
        System.out.println("Sorted array is");

        for (i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");

    }

}
