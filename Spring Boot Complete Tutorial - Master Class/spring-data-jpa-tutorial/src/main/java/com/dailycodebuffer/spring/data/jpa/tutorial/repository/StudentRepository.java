package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/* @Auther: wuyang
 * @Date: 2023/01/16/21:13
 * @Description:
 */
@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstName(String firstName);

    List<Student> findByLastnameContaining(String key);

    List<Student> findByLastnameNotNull();

    List<Student> findByGuardianName(String Name);

    Student findByFirstNameAndLastname(String fn,String ln);
 }
