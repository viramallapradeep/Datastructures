package recursion;

public class Recursion {


    static int fp = 15;

    static void fun1(int n) {
        int i = 0;
        if (n > 1)
            fun1(n - 1);
        for (i = 0; i < n; i++)
            System.out.print(" * ");
    }

    static void fun2(int n) {
        int LIMIT = 200;
        if (n <= 0) return;
        if (n > LIMIT) return;

        System.out.print(n + " ");
        fun2(2 * n);
        System.out.print(" " + n);
    }

    static int fun3(int x, int y) {
        if (x == 0)
            return y;
        else
            return fun3(x - 1, x + y);
    }

    static void fun(int x) {
        if (x > 0) {
            fun(--x);
            System.out.print(x + " ");
            fun(--x);
        }
    }

    static int fun(int[] a, int n) {
        int x;
        if (n == 1)
            return a[0];
        else
            x = fun(a, n - 1);
        if (x > a[n - 1])
            return x;
        else
            return a[n - 1];
    }

    static int fun10(int i) {
        if (i % 2 == 1)
            return (i++);
        else
            return fun10(fun10(i - 1));
    }

    static int fun12(int a, int b) {
        if (b == 0)
            return 0;
        if (b % 2 == 0)
            return fun12(a + a, b / 2);

        return fun12(a + a, b / 2) + a;
    }

    static int fun33(int n) {
        if (n > 100)
            return n - 10;
        return fun33(fun33(n + 11));
    }

    static void abc(String s) {
        if (s.length() == 0)
            return;

        abc(s.substring(1));
        abc(s.substring(1));
        System.out.print(s.charAt(0) + " ");
    }

    public static boolean recRev(int[] a, int x) {

        if (x >= a.length - x - 1) {
            return true;
        }

        if (a[x] == a[a.length - x - 1]) {
            return recRev(a, ++x);
        } else
            return false;
    }

    public static boolean stringPalind(String str, int x, int y) {


        if (x >= y) {
            return true;
        }

        if (str.charAt(x) == str.charAt(y)) {
            return stringPalind(str, ++x, --y);
        } else
            return false;
    }

    static int fun22(int count) {
        System.out.println(count);
        if (count < 3) {
            fun22(fun22(fun22(++count)));
        }
        return count;
    }

    public static int add(int n) {

        if (n <= 0) {
            return n;
        }
        return n + add(n - 1);

    }

    static int fun78(int n) {
        int t, f;

        if (n <= 2) {
            fp = 1;
            return 1;
        }
        t = fun78(n - 1);
        f = t + fp;
        fp = t;
        return f;
    }

    public static void main(String[] args) {
        abc("xyz");
    }

}
