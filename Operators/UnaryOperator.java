package Operators;

public class UnaryOperator {
    public static void main(String[] args) {
    double number = 10;
    boolean flag = false;
    System.out.println("+number = " + +number);
// number is equal to 10.
    System.out.println("-number = " + -number);
// number is equal to 10.
// ++number is equivalent to number = number + 1
    System.out.println("number = " + ++number);
// number is equal to 11.
// -- number is equivalent to number = number - 1
    System.out.println("number = " + --number);
// number is equal to 10.
    System.out.println("!flag = " + !flag);
// flag is still false.
    System.out.println(number++);
    System.out.println(number);
    System.out.println(++number);
    System.out.println(number);
}
}
