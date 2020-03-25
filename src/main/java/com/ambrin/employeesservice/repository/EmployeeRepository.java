package com.ambrin.employeesservice.repository;

import com.ambrin.employeesservice.model.Employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}
