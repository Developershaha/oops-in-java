package basicOfJava;

public class TernaryOperator {


    int num1 = 14;
    int num2 = 4;

    // use ternary operator
    public static void main(String[] args) {
        TernaryOperator tr = new TernaryOperator();
        int greateest=tr.num1 > tr.num2 ? tr.num1 : tr.num2;
        System.out.println("check greater number between two " +greateest);
    }
}
