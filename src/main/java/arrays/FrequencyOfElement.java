package arrays;

public class FrequencyOfElement {

    public static void main(String[] args) {

        int[] array = {23, 2, 3, 32, 34, 87, 98, 32, 23, 54, 12, 677, 32, 34};

        int x = 34;
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x) {
                count++;
            }
        }
        System.out.println("frequency of " + x + " is " + count);
    }

}
