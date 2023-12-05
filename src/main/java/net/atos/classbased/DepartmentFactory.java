package net.atos.classbased;

import java.util.Arrays;
import java.util.List;

public class DepartmentFactory implements ModelFactory<Department> {

    private List<Employee> employees;

    @Override
    public Department create() {
        employees = Arrays.asList(
            new Employee("Anderson", 20000.0),
            new Employee("Guilherme", 20000.0),
            new Employee("Juliana", 20000.0)
        );
        return new Department("Squad One", employees);
    }
}
