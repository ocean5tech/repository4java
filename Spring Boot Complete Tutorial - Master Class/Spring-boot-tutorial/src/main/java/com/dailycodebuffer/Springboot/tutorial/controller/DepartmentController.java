package com.dailycodebuffer.Springboot.tutorial.controller;

/* @Auther: wuyang
 * @Date: 2023/01/08/14:16
 * @Description:
 */

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import com.dailycodebuffer.Springboot.tutorial.service.DepartmentService;
import com.dailycodebuffer.Springboot.tutorial.service.DepartmentServiceImpl;
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
        // DepartmentService service = new DepartmentServiceImpl();  不需要New，因为Autowired可以直接引用容器里的对象
        return departmentService.saveDepartment(department);
    }
}
