package ru.skypro.lessons.springboot.weblibrary;

import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface EmployeeRepository {
    Employee findEmployeeWithMaxSalary();

    Employee findEmployeeWithMinSalary();

    Integer getSumOfSalary();

    List<Employee> findEmployeeWithHighSalary();
}
