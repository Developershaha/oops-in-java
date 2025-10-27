package oops.Inheritance;

class Parent {
    int a = 10;

    void display() {
        System.out.println("parent method called ");
    }
}

class Child extends Parent {
    int a = 100;

    void display() {
        System.out.println("child method called and this is overriden method" + a);

        System.out.println("parent data memver " + super.a);

        super.display();
    }
}

public class ThisAndSuper {

    public static void main(String[] args) {
        new Child().display();
    }
}
