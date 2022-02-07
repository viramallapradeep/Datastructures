import java.util.ArrayList;
import java.util.List;

public class Generics<j> {

    public static void main(String[] args) {

        List<String> p1 = new ArrayList<>();
        p1.add("1");

        List<String> p2 = new ArrayList<>();
        p2.add("2");

        System.out.println(addIt(p1, p2));


        List<Integer> p3 = new ArrayList<>();
        p3.add(3);

        List<Integer> p4 = new ArrayList<>();
        p4.add(4);

        System.out.println(addIt(p3, p4));

        List<?> k = new ArrayList<>();


    }

    private static <E> List<E> addIt(List<E> p1, List<E> p2) {
        p1.addAll(p2);
        return p1;
    }

}
