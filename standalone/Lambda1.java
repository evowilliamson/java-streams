import java.util.Comparator;

public class Lambda1 {

    public static void main(String[] args) {
        
        Comparator<Employee> byName = new Comparator<Employee>() {

            public int compare(Employee a, Employee b) {
                return a.getName().compareTo(b.getName());
            }

        };

        Comparator<Employee> byNameLambda1 = 
            (Employee a, Employee b) -> { return a.getName().compareTo(b.getName()); };

        Comparator<Employee> byNameLambda2 = 
            (a, b) -> { return a.getName().compareTo(b.getName()); };

        Comparator<Employee> byNameLambda3 = 
            (a, b) -> a.getName().compareTo(b.getName()); 

        System.out.println(byNameLambda3.compare(
            new Employee("cccc", 10000), new Employee("d", 2000)));

    }

}