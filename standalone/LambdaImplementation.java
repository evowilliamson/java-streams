import java.util.function.Consumer;

/**
 * LambdaImplementation
 */
public class LambdaImplementation {

    public static void main(String[] args) {
        
        System.out.println("Non-capturing lambda, one instance");
        for (int i = 0; i < 5; i++) {
            Consumer<String> c1 = msg -> System.out.println("Consuming " + msg);
            c1.accept(c1.toString());
            Consumer<String> c2 = msg -> System.out.println("Consuming " + msg);
            c2.accept(c2.toString());
        }

        for (int i = 0; i < 5; i++) {
            Consumer<String> c1 = msg -> System.out.println("Consuming " + msg);
            c1.accept(c1.toString());
            Consumer<String> c2 = msg -> System.out.println("Consuming " + msg);
            c2.accept(c2.toString());
        }

    }
}