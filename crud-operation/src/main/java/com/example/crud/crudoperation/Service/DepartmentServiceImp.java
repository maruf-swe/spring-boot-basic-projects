package com.example.crud.crudoperation.Service;

import com.example.crud.crudoperation.entity.Department;
import com.example.crud.crudoperation.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class DepartmentServiceImp implements DepartmentService {
    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public Department saveDepartment(Department department) {
        return departmentRepository.save(department);
    }

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartment(Long departmentId) {
        return departmentRepository.findById(departmentId).get();
    }

    @Override
    public void deleteDepartment(Long departmentId) {
        departmentRepository.deleteById(departmentId);
    }

    @Override
    public Department updateDepartment(Long departmentId, Department department) {
        Department debData = departmentRepository.findById(departmentId).get();
        if(Objects.nonNull((department.getDepartmentName()) &&
                !"".equalsIgnoreCase((department.getDepartmentName()) {
            debData.setDepartmentName(department.getDepartmentName());
        }

        if(Objects.nonNull((department.getDepartmentCode()) &&
        !"".equalsIgnoreCase((department.getDepartmentCode()) {
            debData.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull((department.getDepartmentId()) &&
        !"".equalsIgnoreCase((department.getDepartmentId()) {
            debData.getDepartmentId(department.getDepartmentId());
        }

        if(Objects.nonNull((department.getDepartmentAddress()) &&
        !"".equalsIgnoreCase((department.getDepartmentAddress()) {
            debData.getDepartmentAddress(department.getDepartmentAddress());
        }
    }

}
