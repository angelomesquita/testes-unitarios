package net.atos.classbased;

import org.junit.Before;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class CompanyTest {

    private ModelFactory<Employee> employeeFactory = new EmployeeFactory();
    private ModelFactory<Department> departmentFactory = new DepartmentFactory();

    @Test
    public void testEmployee() {
        // Arrange
        Employee employee = employeeFactory.create();

        // Act
        String name = employee.getName();
        double salary = employee.getSalary();

        // Assert
        assertEquals("Hiago", name);
        assertEquals(20000.0, salary, 0.001);
    }

    @Test
    public void testDepartment() {
        // Arrange
        Department department = departmentFactory.create();
        String squadName = "Squad One";
        int numberOfEmployees = 3;

        // Act
        String name = department.getName();
        List<Employee> employees = department.getEmployees();

        // Assert
        assertEquals(squadName, name);
        assertEquals(numberOfEmployees, employees.size());
    }
}
