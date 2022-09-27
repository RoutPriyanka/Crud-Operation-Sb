package com.rout.crud.service;

import com.rout.crud.entity.Department;

import java.util.List;

public interface DepartmentService {

  Department saveDepartment(Department dept);

  Department updateDepartment(Department dept,Long departmentId);

  List<Department> fetchDepartmentList();

  void deleteDepartmentById(Long departmentId);
}
