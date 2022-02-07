package arrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindElementsthatAppersNbyKTimes {


    public static void main(String[] args) {

        int[] arr = {3, 1, 2, 2, 1, 2, 4, 4, 4, 3, 3};

        int k = 4;

        int times = arr.length / k;


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
        }

        int toFind = arr[0];

        int count = 1;

        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < arr.length; i++) {
            if (toFind == arr[i]) {
                count++;
            } else {
                if (count > times) {
                    System.out.println(toFind + " is present " + count);
                }
                toFind = arr[i];
                count = 1;
            }
        }

        if (count > times) {
            System.out.println(toFind + " is present " + count);
        }


        System.out.println("-------------------------case 2--------------------------");


        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {

            if (map.containsKey(arr[i])) {
                Integer integer = map.get(arr[i]);
                map.put(arr[i], integer + 1);
            } else {
                map.put(arr[i], 1);
            }

        }


        for (int i : map.keySet()) {
            if (map.get(i) > times) {
                System.out.println(i + " is present " + map.get(i));
            }
        }


    }


}
