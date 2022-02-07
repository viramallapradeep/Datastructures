import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student implements Comparable<Student> {

    private int rollNo;
    private int age;

    private String name;

    private int marks;

    public Student(int rollNo, int age, String name, int marks) {
        this.rollNo = rollNo;
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    public static void main(String[] args) {

        List<Student> list = new ArrayList<>();

        list.add(new Student(123, 25, "abc", 334));
        list.add(new Student(13, 254, "wrwer", 432));
        list.add(new Student(13, 252, "wer", 543));
        list.add(new Student(98, 245, "svsf", 678));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

        Collections.sort(list, new Comparator<Student>() {

            @Override
            public int compare(Student st1, Student st2) {
                if (st1.age > st2.age)
                    return 1;
                else if (st1.age < st2.age)
                    return -1;

                else
                    return 0;
            }
        });

        System.out.println("==" + list);

    }

    public String toString() {

        return "roll no = " + this.rollNo + " age =" + this.age;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    @Override
    public int compareTo(Student st) {
        if (this.rollNo > st.rollNo)
            return -1;
        else
            return 1;

    }

}
