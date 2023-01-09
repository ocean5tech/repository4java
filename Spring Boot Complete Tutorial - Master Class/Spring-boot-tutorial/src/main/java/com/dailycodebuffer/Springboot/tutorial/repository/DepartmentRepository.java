package com.dailycodebuffer.Springboot.tutorial.repository;

import com.dailycodebuffer.Springboot.tutorial.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* @Auther: wuyang
 * @Date: 2023/01/08/20:34
 * @Description:
 */
@Repository
public interface  DepartmentRepository extends JpaRepository<Department,Long> {
//    public Department findByDepartmentName(String departmentName);

    public Department findByDepartmentNameIgnoreCase(String departmentName);

}
