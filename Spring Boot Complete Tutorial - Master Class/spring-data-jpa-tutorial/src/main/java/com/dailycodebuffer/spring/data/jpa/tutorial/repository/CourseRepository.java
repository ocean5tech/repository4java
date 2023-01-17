package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* @Auther: wuyang
 * @Date: 2023/01/17/13:59
 * @Description:
 */
@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {

}
