package javaPractise;

import java.util.*;
import java.util.stream.Collectors;

public class LambdaAndStreams {

    static List<Employee> getAllEmpList(){

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"raju","hyderabad",45));
        list.add(new Employee(104,"naresh","delhi",34));
        list.add(new Employee(103,"raamu","kolkatta",67));
        list.add(new Employee(107,"suresh","chennai",25));
        list.add(new Employee(102,"Pradeep","banglore",77));
        list.add(new Employee(108,"sandeep","kerala",36));

    return list;
    }


    static Map<Integer,Employee> getAllEmpMap(){

        Map<Integer,Employee> map = new HashMap<>();
        map.put(1,new Employee(101,"raju","hyderabad",56));
        map.put(2,new Employee(108,"naresh","delhi",67));
        map.put(3,new Employee(103,"raamu","kolkatta",23));
        map.put(4,new Employee(107,"suresh","chennai",56));
        map.put(5,new Employee(102,"Pradeep","banglore",26));
        map.put(6,new Employee(104,"sandeep","kerala",88));

        return map;
    }


    static List<String> getStringList(){
        List<String> list = Arrays.asList("raju","sandeep","pradeep","Narender","Shashi");
        return list;
    }

    static List<Integer> getIntList(){
        List<Integer> list = Arrays.asList(44,66,22,7,99,77);
        return list;
    }

    public static void main(String[] args) {
        // print all elements with out streams
        getAllEmpList().forEach(System.out::println);
        System.out.println("-----------------------------------print with streams---------------------------------------------------");

        //print with streams
        getAllEmpList().stream().forEach(System.out::println);
        System.out.println("----------------------------------------iterating list with for each by providing consumer(FI) imp----------------------------------------------");

        //iterating list with for each by providing consumer(FI) imp
        getAllEmpList().stream().forEach(e-> System.out.println(e.getName()));
        System.out.println("---------------------------------iterate map with foreach providing consumer(FI) imp-----------------------------------------------------");

        //iterate map with foreach providing consumer(FI) imp
        getAllEmpMap().entrySet().stream().forEach(e-> System.out.println(e.getValue().getId()+"--"+e.getValue()));

        System.out.println("-----------------------------------------filter list---------------------------------------------");
        // filter list
        getAllEmpList().stream().filter(e -> {return e.getAge()>45; }).forEach(System.out::println); ;
        System.out.println("-----------------------------------------filter list---------------------------------------------");
        List<Employee> collect = getAllEmpList().stream().filter(e -> {
            return e.getAge() > 45;
        }).collect(Collectors.toList());

        System.out.println(collect);
        System.out.println("-------------------------------------------filter map-------------------------------------------");
        // filter map
        getAllEmpMap().entrySet().stream().filter(e-> {
            return  e.getValue().getAge()<45;

        }).forEach(System.out::println);

        System.out.println("-----------------------------------------sort list---------------------------------------------");

        List<Integer> intList = getIntList();
//        Collections.sort(intList);
//        intList.forEach(System.out::println);

        intList.stream().sorted().forEach(System.out::println);
        intList.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);


        List<Employee> allEmpList1 = getAllEmpList();
        Collections.sort(allEmpList1);
        allEmpList1.forEach(System.out::println);


        List<Employee> allEmpList2 = getAllEmpList();
//        allEmpList2


    }

}
