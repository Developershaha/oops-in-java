package basicOfJava;

public class WrapperClass {

    public static void main(String[] args) {
        // in this we will do the practice of boxing unboxing
        // and autobonxing and autounboxing - this auto thing handle by compiler


        // Boxing - converting primitive data type to its corresponding wrapper class object
//        AutoBoxing - same thing happened like boxing but this is done by compiler automatically

        int num =10 ; // variable declare that is primitive data type
        Integer num1=num ;// this is autoboxing

        Integer x= Integer.valueOf(num); // boxing


        // UnBoxing - converting wrapper classes into its corresponding primitive data types

        // AutoUnBoxing - its automatically happed by jvm

        Integer n3=Integer.valueOf(55);
        int num4=n3; // Unboxing
        int num5=n3.intValue();// autoUnboxing

    }
}
