package com.example.crud.crudoperation.Service;

import com.example.crud.crudoperation.entity.Department;
import com.example.crud.crudoperation.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImp implements DepartmentService{
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        departmentRepository.save(department);
    }
}
