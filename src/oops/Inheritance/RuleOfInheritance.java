package oops.Inheritance;

class A {
    public void display() {
        System.out.println("calling parent");
    }
}

class B extends A {
    public void display() {
        System.out.println("calling child");
    }

    void main() {
        System.out.println("main");
    }
}


public class RuleOfInheritance {
    public static void main(String[] args) {
        A b = new B();
        b.display();
        ((B) b).main();// downcasting
    }
}
