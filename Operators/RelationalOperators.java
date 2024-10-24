package Operators;

public class RelationalOperators {
    
    public static void main(String[] args)
    {
        int number1=26;
        int number2=02;
    if (number1 > number2)
    {
    System.out.println("number1 is greater than number2.");
    }
    if (number1 < number2)
    {
    System.out.println("number2 is greater than number1.");
    }
    if (number1 == number2)
    {
    System.out.println("number1 is equal to number2.");
    }
    if (number1 != number2)
    {
    System.out.println("number1 is Not equal to number2.");
    }
    System.out.println("number1 >= number2 is " + (number1 >= number2));
    System.out.println("number1 <= number2 is " + (number1 <= number2));
    }
}