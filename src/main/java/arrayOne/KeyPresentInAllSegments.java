package arrayOne;

public class KeyPresentInAllSegments {

    public static void main(String[] args) {

        int[] a = {3, 5, 3, 4, 9, 3, 1, 7, 3, 11, 12, 3, 23, 4, 3, 3};

        int x = 3, k = 3, seg = 2, i = 0;
        int count = 0;


        while (i <= seg && i < a.length) {
            boolean flag = false;

            if (x == a[i]) {
                flag = true;
                count++;
            }

            if (flag) {
                i = seg + 1;
                seg = seg + k;
                flag = false;
            } else {
                i++;
            }

        }

        int kk = (a.length / k) + a.length % k;

        System.out.println(kk);

        System.out.println(count == kk);


    }

}
