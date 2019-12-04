import java.util.function.Consumer;

/**
 * LambdaInterfaces
 */
public class LambdaInterfaces {

    public static void main(String[] args) {

        Consumer<String> c1 = (msg) -> {System.out.println(msg);};
        c1.accept(("fdskjfdsjfkldsjfkldsj fsf"));

        Consumer<?> c2 = (String msg) -> System.out.println(msg.length());

        c1.accept(("fdskjfdsjfkldsjfkldsj fsf"));
        ((Consumer<String>) c2).accept(("fkdslkfdlskfld;skfl;"));

    }
}