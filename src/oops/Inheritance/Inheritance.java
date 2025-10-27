package oops.Inheritance;
class Shahaji{
    private int age;
    void showAge(){
        age =40;
        System.out.println("age is "+age);
    }
}


class Kokane extends Shahaji{
    void dipsplay(){

        // in child class private data member not inheritance in the child clas

//        this is ensure  that encapsulation does not get affected
        System.out.println("print age");
    }

}

public class Inheritance {
    public static void main(String[] args) {
        Kokane k=new Kokane();
        k.showAge();
    }
}
