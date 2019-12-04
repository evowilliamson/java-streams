import java.util.function.IntBinaryOperator;

/**
 * FuncInterfacesPrimitiveTypes
 */
public class FuncInterfacesPrimitiveTypes {

    public static void main(String[] args) {
        
        IntBinaryOperator sum = (a, b) -> a + b;
        int c = sum.applyAsInt(100, 200);
        System.out.println(c);

    }

}