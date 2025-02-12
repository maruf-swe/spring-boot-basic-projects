package com.example.crud.crudoperation.Service;

import com.example.crud.crudoperation.entity.Department;

import java.util.List;

public interface DepartmentService {
    public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department getDepartment(Long departmentId);
}
