package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Guardian;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/* @Auther: wuyang
 * @Date: 2023/01/16/21:35
 * @Description:
 */

@SpringBootTest
//@DataJpaTest  用了以后就不会更新数据库了？
class StudentRepositoryTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
    public void saveStudent(){

        Student student = Student.builder()
                .emailId("stu@gmail.com")
                .firstName("fn")
                .lastname("ln")
//                .guardianEmail("g@gmail.com")
//                .guardianMobile("9999999999")
//                .guardianName("gn")
                .build();

        studentRepository.save(student);

    }

    @Test
    public void saveStudentWithGuardian(){

        Guardian guardian = Guardian.builder()
                .name("gd")
                .email("gd@gmail.com")
                .mobile("1234567890")
                .build();

        Student student = Student.builder()
                .firstName("fn")
                .lastname("ln")
                .emailId("ee@gmail.com")
                .guardian(guardian)
                .build();

        studentRepository.save(student);

    }

    @Test
    public void printAllStudent(){
        List<Student> studentList =
                studentRepository.findAll();

        System.out.println("student = " + studentList);
    }

    @Test
    public void printStudentByFirstName(){
        List<Student> students =
                studentRepository.findByFirstName("fn");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentByLastNameContaining(){
        List<Student> students =
                studentRepository.findByLastnameContaining("n");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentBasedOnGuardianName(){
        List<Student> students =
                studentRepository.findByGuardianName("n");

        System.out.println("students = " + students);
    }

    @Test
    public void printStudentLastnameNotNull(){
        List<Student> students =
                studentRepository.findByLastnameNotNull();

        System.out.println("students = " + students);
    }

    @Test
    public void printGetStudentByEmailAddress(){
        Student student =
                studentRepository.getStudentsByEmailAddress("stu@gmail.com");

        System.out.println("student = " + student);
    }

    @Test
    public void printGetStudentByEmailAddressNative(){
        Student student =
                studentRepository.getStudentsByEmailAddressNative("ee@gmail.com");

        System.out.println("student = " + student);
    }

    @Test
    public void printGetStudentByEmailAddressNativeNamedParam(){
        Student student =
                studentRepository.getStudentsByEmailAddressNativeNamedParam("ee@gmail.com");

        System.out.println("student = " + student);
    }

    @Test
    public void updateStudentNameByEmailId(){

        studentRepository.updateStudentNameByEmailId("fn2", "ee@gmail.com");

    }
}