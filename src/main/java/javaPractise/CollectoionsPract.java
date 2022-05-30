package javaPractise;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class CollectoionsPract {

    public static void main(String[] args) {

        Queue<String> q = new PriorityQueue<>();
        q.add("a");
        q.add("b");
        q.add("c");
        q.add("d");
        q.add("e");

        q.forEach(System.out::println);

    }

}
