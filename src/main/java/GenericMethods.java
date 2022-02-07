import java.util.List;

public class GenericMethods {

    public static void main(String[] args) {


    }


    public static void doIt(List<? extends Animals> param) {

        System.out.println(param);

    }

    public static void dmakeIt(List<? super Animals> param) {

        System.out.println(param);

    }


}

class founa {

    public void bark() {
        System.out.println("------");
    }

}

class Animals extends founa {

    @Override
    public void bark() {
        System.out.println("sound");
    }
}

class cat extends Animals {

    @Override
    public void bark() {
        System.out.println("meow meow");
    }

}

class dog extends Animals {

    @Override
    public void bark() {
        System.out.println("bow bow");
    }
}
