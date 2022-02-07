package arrays;

public class MinimumMumberOfJumpsToEnd {


    //time complexity
    public static void main(String[] args) {

//		int	arr[] = {11,3, 2, 4, 2, -1, -1, -1, 6, 8, 9};
//		int	arr[] = {1,1,1,1,1,1,1,1,1,1,1};
//		int	arr[] ={ 3, 6, 3, 2, 3, 6, 8, 9, 5 };
//					 0  1  2  3  4  5  6  7  8

        int[] arr = {};

        int len = arr.length;

        int pointer = 0;

        int count = 0;

        boolean found = false;

        while (!found && pointer < len) {
            int temp = arr[pointer];

            if (pointer < len && temp + pointer == len - 1 && pointer == 0 && arr[pointer + 1] == 0) {
                found = true;
                break;
            }


            if (temp + pointer >= len - 1) {
                found = true;
                count++;
                break;
            }

            int max = -1, index = -1;
            for (int i = pointer + 1; i <= pointer + temp; i++) {

                if (max < arr[i] + i) {
                    max = arr[i] + i;
                    index = i;
                }

            }

            if (index > len || max <= 0) {
                break;
            } else {
                pointer = index;
                count++;
            }
        }

        if (!found) {
            System.out.println(-1);
        } else {
            System.out.println(count);
        }

    }

}
