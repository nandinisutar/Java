package Variable;

public class Type {
    static int m=100; //static variable
    void method()
    {
        int n=90; //Local variable
        System.out.println("Local variable n: " + n);
    }
    public static void main(String args[]){
        int data=50; //instance variable
        System.out.println("Instance variable data: " + data);
    }
}
