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
        list.add(new Employee(102,"pradeep","banglore",77));
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


    static Map<Integer,String> getMap(){

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"raju");
        map.put(2,"naresh");
        map.put(3,"raamu");
        map.put(4,"suresh");
        map.put(5,"pradeep");
        map.put(6,"Somesh");

        return map;
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

        //custom sort List
        System.out.println("-----------------------------------------sort list-------------------custom sort--------------------------");

        List<Employee> allEmpList2 = getAllEmpList();

        Collections.sort(allEmpList2,(e1,e2)->{
            return  e1.getName().compareTo(e2.getName());
        });
        allEmpList2.forEach(System.out::println);

        //stream sort
        System.out.println("------------------sort list--------stream-----------custom sort--------------------------");
        // descending order
        getAllEmpList().stream().sorted((e1,e2)->{ return e2.getAge()-e1.getAge();}).forEach(System.out::println);

        //inbuilt sort options
        System.out.println("-------");
        getAllEmpList().stream().sorted(Comparator.comparing(emp -> emp.getId()))
                .sorted(Comparator.reverseOrder()).forEachOrdered(System.out::println);

        System.out.println("-foreach and foreachorder------");
        getAllEmpList().stream().forEach(System.out::println);
        System.out.println("--------------");
        getAllEmpList().parallelStream().forEach(System.out::println);
        System.out.println("------order on parllel streams-foreachorded-------");
        getAllEmpList().stream().parallel().filter(e->{return e.getAge()>35;}).forEachOrdered(System.out::println);

        System.out.println("-----no-order on parllel streams--foreach------");
        getAllEmpList().stream().parallel().filter(e->{return e.getAge()>35;}).forEach(System.out::println);


        System.out.println("-----------------------------------------sort map-------------------custom sort---------------stream sort-----------");

        System.out.println("--------iteration---");
        getMap().forEach((k,v)-> System.out.println(k+"--"+v));

        System.out.println("-----------");
        getAllEmpMap().forEach((k,v)->{
            System.out.println(k + " -- "+ v.getAddress());
        });
        System.out.println("--------iteration---");
        getAllEmpMap().entrySet().forEach((e)->{
            System.out.println(e.getKey() + " -- "+ e.getValue().getAddress());
        });
        System.out.println("----stream----iteration---");

        getAllEmpMap().entrySet().stream().forEach((e)->{
            System.out.println(e.getKey() + " -- "+ e.getValue().getAddress());
        });
        System.out.println("--parallel--stream----iteration---");

        getAllEmpMap().entrySet().parallelStream().forEach((e)->{
            System.out.println(e.getKey() + " -- "+ e.getValue().getAddress());
        });

        System.out.println("-------sort map----");

        List<Map.Entry<Integer, String>> mapEs = getMap().entrySet().stream().collect(Collectors.toList());

        Collections.sort(mapEs,(k1, k2)->{
            return  k2.getValue().compareTo(k1.getValue());
        });
        mapEs.forEach(e-> System.out.println(e.getKey()+"--"+e.getValue()));

        System.out.println("-------sort map--Comparator.comparing(e->e.getKey()))--");
        mapEs.stream().sorted(Comparator.comparing(e->e.getKey()))  .forEach(System.out::println);

        System.out.println("-------sort map--Comparator.comparing(e->e.getKey()))- reverse order-");

        mapEs.stream().sorted(Map.Entry.comparingByKey(
                (v1,v2)->{
                    return  v2-v1;
                }
        )).forEach(System.out::println);

        System.out.println("-------sort map--traditional--custom object--emp");

        List<Map.Entry<Integer, Employee>> mapESemp = getAllEmpMap().entrySet().stream().collect(Collectors.toList());



    }

}
