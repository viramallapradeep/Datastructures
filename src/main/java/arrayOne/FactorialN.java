package arrayOne;

public class FactorialN {

    public static void main(String[] args) {

        int[] result = new int[1000];

        result[0] = 1;

        int size = 1;

        for (int i = 1; i <= 5; i++) {
            size = fact(result, size, i);
        }

        for (int i = size - 1; i >= 0; i--) {

            System.out.print(result[i]);

        }


    }

    public static int fact(int[] result, int size, int n) {

        int carry = 0;

        for (int i = 0; i < size; i++) {

            int prod = result[i] * n + carry;
            result[i] = prod % 10;
            carry = prod / 10;
        }

        while (carry != 0) {
            result[size] = carry % 10;
            carry = carry / 10;
            size++;

        }

        return size;
    }

}
