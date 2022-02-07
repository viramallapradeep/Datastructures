package arrayOne;

import java.util.Arrays;
import java.util.Stack;

public class StockSpan2 {

    public static void main(String[] args) {

        int[] p = {100, 80, 60, 70, 60, 75, 85};
        int n = p.length;

        int[] op = new int[n];
        op[0] = 1;


        Stack<Integer> st = new Stack<>();
        st.push(0);

        for (int i = 1; i < n; i++) {

            while (!st.empty() && p[st.peek()] <= p[i])
                st.pop();

            if (!st.empty()) {
                op[i] = i - st.peek();
            } else {
                op[i] = i + 1;
            }

            st.push(i);

        }

        System.out.println(Arrays.toString(op));
    }

}

