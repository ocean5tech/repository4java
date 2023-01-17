package com.dailycodebuffer.spring.data.jpa.tutorial.repository;

import com.dailycodebuffer.spring.data.jpa.tutorial.entity.CourseMaterial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/* @Auther: wuyang
 * @Date: 2023/01/17/14:09
 * @Description:
 */
@Repository
public interface CourseMaterialRepository extends JpaRepository<CourseMaterial, Long> {

}
