package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Course;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;
import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Teacher;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


/* @Auther: wuyang
 * @Date: 2023/01/17/14:49
 * @Description:
 */
@SpringBootTest
class CourseRepositoryTest {

    @Autowired
    private CourseRepository courseRepository;

    @Test
    public void printCourses(){

        List<Course> courses = courseRepository.findAll();

        System.out.println("courses = " + courses);
    }

    @Test
    public void saveCourseWithTeacher(){

        Teacher teacher = Teacher.builder()
                .firstName("tfn2")
                .lastName("tln2")
                .build();

        Course course = Course.builder()
                .title("Python")
                .credit(6)
                .teacher(teacher)
                .build();

        courseRepository.save(course);

    }

    @Test
    public void findAllPagination(){

        Pageable firstPageWithThreeRecords = PageRequest.of(0,3);
        Pageable secondPageWithTwoRecords =  PageRequest.of(1,2);

        List<Course> courses = courseRepository.findAll(secondPageWithTwoRecords).getContent();

        System.out.println("courses = " + courses);

        long totalElements = courseRepository.findAll(secondPageWithTwoRecords).getTotalElements();

        System.out.println("totalElements = " + totalElements);

        long totalPages = courseRepository.findAll(secondPageWithTwoRecords).getTotalPages();

        System.out.println("totalPages = " + totalPages);

    }


    @Test
    public void findAllSorting(){
        Pageable sortByTitle =
                PageRequest.of(
                        0,
                        2,
                        Sort.by("title")
                );

        Pageable sortByCreditDesc =
                PageRequest.of(
                        0,
                        2,
                        Sort.by("credit").descending()
                );

        Pageable sortByTitleAndCreditDesc =
                PageRequest.of(
                        0,
                        2,
                        Sort.by("title")
                                .descending()
                                .and(Sort.by("credit"))
                );

        List<Course> courses = courseRepository.findAll(sortByTitle).getContent();

        System.out.println("courses = " + courses);
    }

    @Test
    public void printFindByTitleContaining(){
        Pageable firstPageTenRecords =
                PageRequest.of(0,10);

        List<Course> courses = courseRepository.findByTitleContaining(
                "D",
                firstPageTenRecords
        ).getContent();

        System.out.println("courses = " + courses);
    }
    
    @Test
    public void saveCourseWithStudentAndTeacher(){

        Teacher teacher=Teacher.builder()
                .firstName("tfn3")
                .lastName("tln3")
                .build();

        Student student = Student.builder()
                .firstName("sfn2")
                .lastname("sln2")
                .emailId("stu3@gmail.com")
                .build();

        Course course = Course.builder()
                .title("AI")
                .credit(12)
                .teacher(teacher)
                .build();

        course.addStudents(student);

        courseRepository.save(course);

    }

}