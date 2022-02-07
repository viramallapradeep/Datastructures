package arrayOne;

import java.util.HashSet;

public class LongestConsecutiveSubsequence2 {

    public static void main(String[] args) {


        int[] arr = {9, 3, 10, 4, 20, 2, 1, 5, 6};


        int n = arr.length;

        HashSet<Integer> s = new HashSet<Integer>();
        int count = 0;
        for (int i = 0; i < n; ++i) {
            s.add(arr[i]);
        }


        for (int i = 0; i < n; ++i) {

            int ans = 0;

            if (!s.contains(--arr[i])) {

                while (s.contains(++arr[i])) {
                    ans++;
                }
            }

            count = Math.max(ans, count);

        }

        System.out.println(count);

    }

}
