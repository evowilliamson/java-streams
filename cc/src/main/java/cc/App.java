package cc;

import lombok.Data;

/**
 * Hello world!
 *
 */
@Data
public class App 
{
    private static int b;
    
    public static void main(final String[] args) {
        System.out.println("Hello World!");
        final A a = new A();
        a.getA();
    }
}

@Data
class A {

    int a;
    double b; 

}