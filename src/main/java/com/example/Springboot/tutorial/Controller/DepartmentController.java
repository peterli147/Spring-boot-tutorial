package com.example.Springboot.tutorial.Controller;

import com.example.Springboot.tutorial.entity.Department;
import com.example.Springboot.tutorial.service.DepartmentService;
import com.example.Springboot.tutorial.service.DepartmentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/departments")
    public Department saveDepartment(@RequestBody Department department){
        //DepartmentService service = new DepartmentServiceImpl();
        return departmentService.saveDepartment(department);

    }

}
