import java.util.ArrayList;
import java.util.List;

public class Main {


        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();

            employees.add(new Employee("Joey", "Sales", 480000));
            employees.add(new Employee("Ross", "Operations", 550000));
            employees.add(new Employee("Monica", "Manager", 450000));
            employees.add(new Employee("Phoebe", "Sales", 600000));
            employees.add(new Employee("Chandler", "Developer", 530000));
            employees.add(new Employee("Rachel", "Operations", 580000));

            // Calculate incremented salary for each employee
            for (Employee employee : employees) {
                SalaryCalculator.calculateIncrementedSalary(employee);
            }

            // Sort employees by salary in descending order
            employees.sort((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()));

            // Output the sorted employees with incremented salaries
            System.out.println("Name\tDepartment\tSalary");
            for (Employee employee : employees) {
                System.out.println(employee);
            }
        }


}
