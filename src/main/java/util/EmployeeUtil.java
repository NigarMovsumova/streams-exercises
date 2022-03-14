package util;

import com.github.javafaker.Faker;
import model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeUtil {

    public static List<Employee> generate() {
        Faker faker = new Faker();
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            Employee employee = new Employee();
            employee.setFullName(faker.funnyName().name());
            employee.setTitle(faker.job().title());
            employees.add(employee);
            employees.add(employee);
        }
        return employees;
    }

}
