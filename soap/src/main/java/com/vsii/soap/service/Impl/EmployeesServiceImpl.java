package com.vsii.soap.service.Impl;

import com.vsii.soap.models.Employees;
import com.vsii.soap.repository.EmployeesRepository;
import com.vsii.soap.service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class EmployeesServiceImpl implements EmployeesService {
    @Autowired
    EmployeesRepository employeesRepository;

    @Override
    public Page<Employees> findAll(Pageable pageable) {
        return employeesRepository.findAll(pageable);
    }

    @Override
    public void save(Employees employees) {
    employeesRepository.save(employees);
    }

    @Override
    public void remove(Long id) {
    employeesRepository.deleteById(id);
    }

    @Override
    public Employees findByUserName(String username) {
        return employeesRepository.findByNameContaining(username);
    }

    @Override
    public Employees findById(int id) {
        return employeesRepository.findById(id).orElse(null);
    }
}
