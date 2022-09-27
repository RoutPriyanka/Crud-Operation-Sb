package com.rout.crud.service;

import com.rout.crud.entity.Department;
import com.rout.crud.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService{

    @Autowired
    private DepartmentRepository deptRepo;

    @Override
    public Department saveDepartment(Department dept){
        return deptRepo.save(dept);
    }
    @Override
    public Department updateDepartment(Department dept,Long departmentId){
        return deptRepo.save(dept);
    }

    @Override
    public List<Department> fetchDepartmentList(){
        return (List<Department>) deptRepo.findAll();
    }

    @Override
   public void deleteDepartmentById(Long departmentId){
        deptRepo.deleteById(departmentId);
   }



}
