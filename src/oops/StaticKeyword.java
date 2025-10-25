package oops;

class Demo {
    static int a;
    static int b;

    {
        // instance blocked is used to initalise instance variable
        // this is called before constructor called and after object created

        System.out.println("instance block called ");
    }

    static {
        System.out.println("static block executed ");
    }

    static void display() {

        System.out.println("static method called ");
    }


}

public class StaticKeyword {
    static {
        System.out.println("before main method this static block called ");
    }

    public static void main(String[] args) {

        Demo dm = new Demo();
//        Demo.display();

    }
}
