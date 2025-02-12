package com.example.crud.crudoperation.Service;

import com.example.crud.crudoperation.entity.Department;

import java.util.List;

public interface DepartmentService {
    Department saveDepartment(Department department);

    List<Department> getAllDepartments();
}
