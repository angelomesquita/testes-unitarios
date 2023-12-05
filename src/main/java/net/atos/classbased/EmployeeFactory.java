package net.atos.classbased;

public class EmployeeFactory implements ModelFactory<Employee> {
    @Override
    public Employee create() {
        return new Employee("Hiago", 20000.0);
    }
}
