package ru.skypro.lessons.springboot.weblibrary;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EmployeeService {
    Employee maxSalary();

    Employee minSalary();

    List<Employee> highSalary();

    Integer sumOfSalary();

}