package com.dailycodebuffer.spring.data.jpa.tutorial.entity;

/* @Auther: wuyang
 * @Date: 2023/01/15/21:12
 * @Description:
 */

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.logging.Logger;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {

    @Id
    private Long studentId;
    private String firstName;
    private String lastname;
    private String emailId;
    private String guardianName;
    private String guardianEmail;
    private String guardianMobile;

}
