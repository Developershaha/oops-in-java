package oops.Inheritance;
class Shahaji{
    int age;
    void showAge(){
        age =40;
        System.out.println("age is "+age);
    }
}


class Kokane extends Shahaji{

}

public class Inheritance {
    public static void main(String[] args) {
        Kokane k=new Kokane();
        k.showAge();
    }
}
