package basicOfJava;

public class Constructor {

    // rules to define constructor
/*
    1) name should be as clas name
    2) not having any return type even void is not acceptable
    3) there are multiple java constructor means java constructor follows the overloding but not follow overriding
    4) we can applied the access modified to the constructor
    5) java called default constructor at the time of object creation


-------- syntax of java constructor

class ClassName {

 ClassName(){
 // statement
 }
public Constructor(

    */

    int num1;
    int num2;

    public Constructor() {
//        this()
        num2 = 44;
        System.out.println("calling no args constructor ");
    }

    Constructor(int num) {
//        this(4);
        this.num1 = num;
    }

    Constructor(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    void display() {

        System.out.println("print num1 and num2 " + num1 + ",  " + num2);
    }


    public static void main(String[] args) {
        Constructor c = new Constructor(4);
        c.display();
    }

}
