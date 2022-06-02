package topic;

final public class Immutable {

    private  int id;

    private String name;

    private Details det;

    public Immutable(int id, String name,Details d) {
        this.id = id;
        this.name = name;
        det = d;
    }

    public Details getDet() {
        return new Details(this.det.getAge());
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {


        Immutable im = new Immutable(23,"pradeep",new Details(45));

        System.out.println(im.getDet().getAge());

        im.getDet().setAge(67);

        System.out.println(im.getDet().getAge());

    }
}

class Details {

    private int age;

    public  Details(int a){
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
