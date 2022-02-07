package arrays;

public class pairsWithGivenSum {


    public static void main(String[] args) {

        int[] arr = {1, 5, 7, -1};

        int sum = 2;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    count++;
                    break;
                }
            }

        }

        System.out.println(count);


    }

}
