package com.rout.crud.controller;

import com.rout.crud.entity.Department;
import com.rout.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService deptService;

    @PostMapping("/saveDepartments")
    public Department saveDepartment(@RequestBody Department dept) {
        return deptService.saveDepartment(dept);
    }

    @PutMapping("/updateDepartment/{id}")
    public Department updateDepartment(@RequestBody Department dept, @PathVariable("id") Long departmentId) {
        return deptService.updateDepartment(dept, departmentId);
    }

    @GetMapping("/getDepartment")
    public List<Department> fetchDepartmentList() {
        return deptService.fetchDepartmentList();
    }

    @DeleteMapping("/delete/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        deptService.deleteDepartmentById(departmentId);
        return "Deleted successfully";
    }
}
