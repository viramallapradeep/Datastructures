package arrays;

public class MinElementInSortedNRotated {


    public static void main(String[] args) {


        int[] arr = {5, 6, 1, 2, 3, 4};

        int min = arr[0];

        //case 1
        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] < arr[i + 1]) {

            } else {
                min = arr[i + 1];
                break;
            }
        }


        System.out.println(min);

    }

}
