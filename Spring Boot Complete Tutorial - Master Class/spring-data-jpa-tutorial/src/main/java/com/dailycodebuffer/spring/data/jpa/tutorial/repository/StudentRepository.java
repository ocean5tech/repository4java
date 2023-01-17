package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
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

    //JPQL
    @Query("select s from Student s where s.emailId = ?1")
    Student getStudentsByEmailAddress(String Emailid);

    //native SQL
    @Query(
            value = "select * from tbl_student s where s.email_address = ?1",
            nativeQuery = true
            )
    Student getStudentsByEmailAddressNative(String emailId);
    @Query(
            value = "select * from tbl_student s where s.email_address = :emailId",
            nativeQuery = true
    )
    Student getStudentsByEmailAddressNativeNamedParam(@Param("emailId") String emailId);

    @Modifying
    @Transactional //一般是用于Servcie层
    @Query(
            value = "update tbl_student set first_name = ?1 where email_address = ?2",
            nativeQuery = true
    )
    int updateStudentNameByEmailId(String firstName, String emailId);

 }
