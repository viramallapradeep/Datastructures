package javaPractise;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaAndStreams {

    static List<Employee> getAllEmpList(){

        List<Employee> list = new ArrayList<>();
        list.add(new Employee(101,"raju","hyderabad",45));
        list.add(new Employee(104,"naresh","delhi",34));
        list.add(new Employee(103,"raamu","kolkatta",67));
        list.add(new Employee(107,"suresh","chennai",25));
        list.add(new Employee(102,"pradeep","banglore",77));
        list.add(new Employee(108,"pradeep","kerala",36));

    return list;
    }


    static Map<Integer,Employee> getAllEmpMap(){

        Map<Integer,Employee> map = new HashMap<>();
        map.put(1,new Employee(101,"raju","hyderabad",56));
        map.put(2,new Employee(108,"naresh","delhi",67));
        map.put(3,new Employee(103,"raamu","kolkatta",23));
        map.put(4,new Employee(107,"suresh","chennai",23));
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

        System.out.println("-----by--key------");

        Collections.sort(mapESemp,Map.Entry.comparingByKey());

        System.out.println("-----by--value------");

        Collections.sort(mapESemp,Map.Entry.comparingByValue());

        mapESemp.forEach(System.out::println);

        System.out.println("---custom sort --by--key------");

        Collections.sort(mapESemp,(v1,v2)->{
        return v2.getKey() - v1.getKey();
        });

        mapESemp.forEach(System.out::println);

        System.out.println("---custom sort --by--value------");

        Collections.sort(mapESemp,(v1,v2)->{
        return   v2.getValue().getName().compareTo(v1.getValue().getName());
        });

        mapESemp.forEach(System.out::println);

        System.out.println("---Stream sort --by--key------");

        getAllEmpMap().entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        System.out.println("---Stream sort --by--key--desc----");

        getAllEmpMap().entrySet().stream().sorted(Map.Entry.comparingByKey((v1,v2)->{
            return v2-v1;
        })).forEach(System.out::println);

        System.out.println("---Stream sort --by--value-----");

        getAllEmpMap().entrySet().stream().sorted((v1,v2)->{
            return v2.getValue().getAge() - v1.getValue().getAge();
        }). forEach(System.out::println);

        System.out.println("---Stream sort --by--value--comparator---");

        getAllEmpMap().entrySet().stream().sorted(Comparator.comparing(em->em.getValue().getName())).forEach(System.out::println);


        System.out.println("-------------------map-------------------flat-Map-------on list------------------------------------------------------");

           List<Integer> mapList= Arrays.asList(2,44,5,22,77,8,9,96).stream().map(v->v*10).collect(Collectors.toList());

            mapList.forEach(System.out::println);

        System.out.println("---emp--list-ids--");

        List<Integer> listIds = getAllEmpList().stream().map(emp->emp.getId()).collect(Collectors.toList());

        listIds.forEach(System.out::println);

        System.out.println("---emp--list--names-");

       List<String> setNames = getAllEmpList().stream().map(emp->emp.getName()).filter(v->v.equalsIgnoreCase("suresh")).collect(Collectors.toList());

       setNames.forEach(System.out::println);

        System.out.println("-----flat--map----");

        List<List<Integer>> dList = new ArrayList<>();

        dList.add(Arrays.asList(55,6,54,22,63,2,457));
        dList.add(Arrays.asList(5785,6,534,232,633,2,4257));
        dList.add(Arrays.asList(505,6,504,22,633,2,4537));

        List<Integer> resList = dList.stream().flatMap(v -> v.stream()).collect(Collectors.toList());
        System.out.println("---------");
        dList.stream().flatMap(v -> v.stream()).limit(3).collect(Collectors.toList()).forEach(System.out::println);

        System.out.println(resList);

        System.out.println("---------");

        Arrays.asList(55,22,54,22,63,2,457).stream().distinct().limit(2).forEach(System.out::println);

        System.out.println("---------");
        Stream.of(getAllEmpList()).forEach(System.out::println);

        System.out.println("---------");

        Stream.of(Arrays.asList(new Employee(78,"rrr","ee",33))).forEach(System.out::println);

        System.out.println("----limit--list---");

        getAllEmpList().stream().map(emp->emp.getAge()).limit(2).forEach(System.out::println);

        System.out.println("-----skip--list--");

        getAllEmpList().stream().map(emp->emp.getAge()).skip(2).forEach(System.out::println);

        System.out.println("-----min  max--list--");

        Integer integer = getAllEmpList().stream().map(emp -> emp.getAge()).max(Comparator.comparing(Integer::valueOf)).get();

//        Integer integer = getAllEmpList().stream().map(emp -> emp.getAge()).max(Comparator.comparing(Integer::valueOf)).get();

        System.out.println(integer);

        System.out.println("-----min  max--list--");

        Employee employee = getAllEmpList().stream().min(Comparator.comparing( employee1 -> employee1.getAge())).get();

        System.out.println("====="+employee);

        System.out.println("-----min--map--");

        Map.Entry<Integer, Employee> integerEmployeeEntry = getAllEmpMap().entrySet().stream().min((e1, e2) -> e1.getValue().getAge() - e2.getValue().getAge()).get();
        System.out.println(integerEmployeeEntry.getValue());

        System.out.println("-----Count--map--");


        long count = getAllEmpMap().entrySet().stream().filter(e -> e.getValue().getAge() > 34).count();

        System.out.println("---count--"+count);

        System.out.println("--------toArray----Map----");
        Object[] objects = getAllEmpMap().entrySet().stream().filter(e -> e.getValue().getAge() > 34).toArray();

        System.out.println(Arrays.toString(objects));

        System.out.println("--------find any----Map----");
     getAllEmpMap().entrySet().stream().filter(e -> e.getValue().getAge() == 23).findAny().ifPresent(k-> System.out.println("age 23 emp== "+k));

        System.out.println("--------findfirst----Map----");

     getAllEmpMap().entrySet().stream().filter(e->e.getValue().getAge()>640).findFirst().
             ifPresentOrElse(k-> System.out.println("llll==="+k),() -> {
         System.out.println("No element found");
     });

        System.out.println("-------anyMatch-----map-------");

        boolean anyMatch = getAllEmpMap().entrySet().stream().anyMatch(e -> e.getValue().getAge() > 34);

        System.out.println("anyMatch=="+anyMatch);

        System.out.println("-------allMatch-----map-------");

        boolean allMatch = getAllEmpMap().entrySet().stream().allMatch(e -> e.getValue().getAge() < 34);

        System.out.println("allMatch==="+allMatch);

        System.out.println("-------allMatch-----map-------");

        boolean noneMatch = getAllEmpMap().entrySet().stream().noneMatch(e -> e.getValue().getAge() > 129);

        System.out.println("noneMatch==="+noneMatch);

        System.out.println("----Terminal----collectors---list--tomap----");

        Map<Integer, String> toMap = getAllEmpList().stream().collect(Collectors.toMap(Employee::getId, Employee::getName));
            toMap.forEach((k,v)-> System.out.println(k+"--"+v));

        System.out.println("--map--Terminal----collectors---toMap------");

        Map<String, String> empMap = getAllEmpMap().entrySet().stream().collect(Collectors.toMap(e -> e.getValue().getName(), e -> e.getValue().getAddress()));

        empMap.forEach((k,v)-> System.out.println(k+"---"+v));

        System.out.println("--map--Terminal----collectors---joining------");

        String joinString = getAllEmpMap().entrySet().stream().map(e -> e.getValue().getName()).collect(Collectors.joining("-"));

        System.out.println("joinString==="+joinString);

        System.out.println("--map--Terminal----collectors---groupBy---1---");

        Map<String, List<Map.Entry<Integer, Employee>>> grupbyName = getAllEmpMap().entrySet().stream().collect(Collectors.groupingBy(e -> e.getValue().getName()));

        grupbyName.forEach((k,v)->{
            System.out.println(k+"=="+v);
        });

        System.out.println("--map--Terminal----collectors---groupBy---2---");
        Map<Integer, List<Map.Entry<Integer, Employee>>> grpByAge = getAllEmpMap().entrySet().stream().collect(Collectors.groupingBy(e -> e.getValue().getAge()));


        grpByAge.forEach((k,v)->{
            System.out.println(k+"=="+v);
        });

        System.out.println("--List--reverse order--");
       getIntList().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("--List--reverse order-employees-");
       getAllEmpList().stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
        System.out.println("--Map--reverse order-employees-");
       getAllEmpMap().entrySet().stream().sorted(Comparator.comparing(e->e.getKey(),Comparator.reverseOrder())). forEach(System.out::println);

        System.out.println("---terminal----counting--------");

        Long collect1 = getIntList().stream().filter(e->e>10).count();

        System.out.println(collect1);

        System.out.println("----counting and terminal from pic------");

    }

}
