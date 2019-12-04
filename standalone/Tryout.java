/**
 * Tryout
 */

interface IFuncInt {
    int func(int num1, int num2);
}

class A {

    private int a;

    public A() {
        this.a = 100;
    }

    void setA(int a) {
        this.a = a;
    }

    int getA() {
        return this.a;
    }

}



public class Tryout {

    public static void main(String[] args) {

    
        int  i = 7;
        A aa = new A();
        System.out.println("" + i);
        IFuncInt funcInt = (num1, num2) -> {
            aa.setA(100);
            //i = num1 + num2;
            return i;
        };

        int b = funcInt.func(100, 200);
        b = 200;

    }

}