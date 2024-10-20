import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SalaryCalculatorTest {

    @Test
    public void testCalculateIncrementedSalary_Developer() {
        Employee developer = new Employee("Chandler", "Developer", 530000);
        SalaryCalculator.calculateIncrementedSalary(developer);
        assertEquals(609500, developer.getSalary(), 0.001);
    }

    @Test
    public void testCalculateIncrementedSalary_Manager() {
        Employee manager = new Employee("Monica", "Manager", 450000);
        SalaryCalculator.calculateIncrementedSalary(manager);
        assertEquals(504000, manager.getSalary(), 0.001);
    }

    @Test
    public void testCalculateIncrementedSalary_Sales() {
        Employee salesPerson = new Employee("Joey", "Sales", 480000);
        SalaryCalculator.calculateIncrementedSalary(salesPerson);
        assertEquals(528000, salesPerson.getSalary(), 0.001);
    }

    @Test
    public void testCalculateIncrementedSalary_Operations() {
        Employee operationsPerson = new Employee("Ross", "Operations", 550000);
        SalaryCalculator.calculateIncrementedSalary(operationsPerson);
        assertEquals(594000, operationsPerson.getSalary(), 0.001);
    }

    @Test
    public void testSortingBySalary() {
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

        // Check that the employees are sorted correctly
        assertEquals("Phoebe", employees.get(0).getName());
        assertEquals("Rachel", employees.get(1).getName());
        assertEquals("Chandler", employees.get(2).getName());
        assertEquals("Ross", employees.get(3).getName());
        assertEquals("Joey", employees.get(4).getName());
        assertEquals("Monica", employees.get(5).getName());
    }
}

