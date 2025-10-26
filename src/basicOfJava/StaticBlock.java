package basicOfJava;

class Demo1 {
    static {
        System.out.println("static block 1");
    }

    ;

    static {
        System.out.println("static block 2");
    }

    ;

    {
        System.out.println("instance block 1");
    }

    ;

    {
        System.out.println("instance block 2");
    }
}

public class StaticBlock {
    public static void main(String[] args) {
// static block execute  at once after class load and before object creation
        Demo1 dm = new Demo1();
        Demo1 dm2= new Demo1();
    }
}
