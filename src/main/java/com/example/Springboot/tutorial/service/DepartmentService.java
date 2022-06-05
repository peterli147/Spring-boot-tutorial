package com.example.Springboot.tutorial.service;

import com.example.Springboot.tutorial.entity.Department;
import org.springframework.stereotype.Service;

@Service
public interface DepartmentService {
    Department saveDepartment(Department department);
}
