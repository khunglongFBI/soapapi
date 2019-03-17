package com.vsii.soap.service;

import com.vsii.soap.models.Employees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface EmployeesService {
    Page<Employees> findAll(Pageable pageable);
    void save(Employees employees);
    void remove(Long id);
    Employees findByUserName(String username);

    Employees findById(int id);
}
