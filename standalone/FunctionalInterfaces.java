import java.time.LocalTime;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * FunctionalInterfaces
 */
public class FunctionalInterfaces {

    public static void main(String[] args) {
        System.out.println(composeHashcodes3(null));
    }

    public static String getAppStatus() {
        System.out.println("GetAppStatus");
        return "Now: " + LocalTime.now();
    }

    public static int getInt() {
        return 300;
    }

    public static String getString() {
        return "300";
    }

    public static int composeHashcodes3(Object a) {
        requireNonNull(a, () -> getInt());
        Objects.requireNonNull(a, () -> getString());
        Objects.requireNonNull(a, () -> "null, " + getAppStatus());
        return a.hashCode();
    }

    public static <T> T requireNonNull(T obj, Supplier<Integer> messageSupplier) {
        if (obj == null)
            throw new NullPointerException(messageSupplier == null ?
                                           null : "" + messageSupplier.get());
        return obj;
    }

}