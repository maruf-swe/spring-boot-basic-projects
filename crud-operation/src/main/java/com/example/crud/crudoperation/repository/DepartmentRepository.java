package com.example.crud.crudoperation.repository;

import com.example.crud.crudoperation.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department,Long> {
}
