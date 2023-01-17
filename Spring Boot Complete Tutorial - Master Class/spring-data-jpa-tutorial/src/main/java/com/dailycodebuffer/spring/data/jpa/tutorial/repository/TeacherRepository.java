package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

/* @Auther: wuyang
 * @Date: 2023/01/17/15:06
 * @Description:
 */
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
