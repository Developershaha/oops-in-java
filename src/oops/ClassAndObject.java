package oops;

public class ClassAndObject {
    String name;
    int number;
//
    void display() {
        name = "shahaji";
        number = 10;
        System.out.println("name " + name + " number" + number);
    }

    public static void main(String[] args) {
        System.out.println("dsfsf");

        ClassAndObject cb = new ClassAndObject();
        System.out.println("name " + cb.name + " number" + cb.number);
        cb.display();
    }
}