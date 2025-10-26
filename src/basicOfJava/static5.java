package basicOfJava;
class Demo5{
    static{
//        System.out.println("static get executed executed"+a);
        display();
    }

    static int a=10;

    public static void display(){
        System.out.println("print value of a "+a);
    }
}
public class static5 {
    public static void main(String[] args) {
        Demo5 dm=new Demo5();
    }
}
