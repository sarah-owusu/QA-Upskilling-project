package project3;

import java.math.BigDecimal;
import java.util.List;

public class EmployeeManagerSystem {

    public static void main(String[] args) {
        Employee developer = new Developer("sarah", 1L, new BigDecimal(5000), "Java");
        Employee manager = new Manager("john", 2L, new BigDecimal(7000), "Meinz");


        List<Employee> employees = List.of(developer, manager);
        employees.forEach(employee ->{
            System.out.println(employee.getName() + " has a salary of " + employee.calculateSalary());
        });
    }
}
