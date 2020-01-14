@FunctionalInterface
public interface TestFunctionalInterface<T> {
    abstract int compare(T o1, T o2);
    abstract boolean equals(Object obj);
}

/**
 * InnerTestFunctionalInterface
 */
class InnerTestFunctionalInterface {

    public static void main(String[] args) {
        
        TestFunctionalInterface<Integer> f = (x, y) -> { 
            if (x > y)  {
                return 1;
            }
            else if (x < y) {
                return -1;

            }
            else {
                return 0;
            }

        };
        System.out.println(f.compare(1, 2));

    }
  
}
