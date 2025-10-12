package oops;

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

    public Constructor(){

        System.out.println("calling no args constructor ");
    }


    public static void main(String[] args) {
        Constructor c=new Constructor();
    }

}
