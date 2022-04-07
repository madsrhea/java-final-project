class Calculator {
    boolean myClass(int a, int b);
    
}
public class MyClass {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        double result = c.sum(3.5, 2);
        System.out.println(result);
    }
}