package javaPractise;
/*
consumer interface
 */

import javax.swing.*;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;

/*public class FuntionalInterfacesImp implements Consumer<Integer> {

    @Override
    public void accept(Integer integer) {
        System.out.println(integer);
    }

    public static void main(String[] args) {
        FuntionalInterfacesImp  fun=  new FuntionalInterfacesImp();
        fun.accept(34);
    }
}*/

public class FuntionalInterfacesImp {

    public static void main(String[] args) {

 // consumer

        //case 1
        Consumer<Integer> con = i ->{
            System.out.println(i+10);
        };

        con.accept(34);

        List<Integer> list = Arrays.asList(3,4,5,6,8,9);
        list.stream().forEach( con );
        //  case2
        list.stream().forEach( (i)->{  if (i>=6) System.out.println(i); } );

// predicate

        //case 1
     Predicate<Integer> pred = (i) -> {
        return (i % 2 == 0);
     };

        List<Integer> listp = Arrays.asList(4,6,7,8,9,2);
        listp.stream().filter(pred).forEach(System.out::println);


        BiFunction<Integer,Integer,String> k = (t,y)->{
            return "ddd";
        };

    }
}



@FunctionalInterface
interface fun<T,R>{
    R add(T t);
}

@FunctionalInterface
interface con<T>{
 void print(T t);
}

@FunctionalInterface
interface  predi<T>{
    boolean  test(T t);
}