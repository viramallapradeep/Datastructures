package topic;

public class Cloning implements  Cloneable {

    private int id ;

    private String name;

    private Add ad;

    public Cloning(int id, String name,Add a) {
        this.id = id;
        this.name = name;
        ad = a;
    }

    public Add getAd() {
        return ad;
    }

    public void setAd(Add ad) {
        this.ad = ad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Shallow cloning ,default implementation

   /*
   @Override
    protected Object clone() throws CloneNotSupportedException {

        Cloning clone = (Cloning) super.clone();

        return  clone;
    }*/

    //Deep cloning ,default implementation
    @Override
    protected Object clone() throws CloneNotSupportedException {

        Cloning clone = (Cloning) super.clone();

        Add addClone = new Add(clone.getAd().getId(),clone.getAd().getName());
        clone.setAd(addClone);
        return  clone;
    }

    public static void main(String[] args) throws CloneNotSupportedException {

        Add ad = new Add(55,"orgnaladd");
        Cloning org = new Cloning(33,"pradeep",ad);
        Cloning clone = (Cloning) org.clone();

        if (org==clone){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        if (org.getAd()==clone.getAd()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }

        org.getAd().setName("changeddddddddd");

        System.out.println(clone.getAd().getName());


    }

}

class Add{

    private  int id;
    private String name;

    public Add(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
