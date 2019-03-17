package com.vsii.soap.repository;

import com.vsii.soap.models.Employees;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
@Repository
public interface EmployeesRepository extends PagingAndSortingRepository<Employees, Integer> {
    Page<Employees> findAll(Pageable pageable);

    Employees findByNameContaining(String name);

    Optional<Employees> findAllById(Long id);

    void deleteById(Long id);
}