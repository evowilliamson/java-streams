import java.util.function.Function;

/**
 * MethodReferences
 */
public class MethodReferences {

    public static void main(String[] args) {

        Function<Employee, Integer> f1 = Employee::getSalary;
        Employee frank = new Employee("frank", 10000);
        Integer sal = f1.apply(frank);

        Function<Employee, Integer> f2 = emp -> emp.getSalary();

    }


}