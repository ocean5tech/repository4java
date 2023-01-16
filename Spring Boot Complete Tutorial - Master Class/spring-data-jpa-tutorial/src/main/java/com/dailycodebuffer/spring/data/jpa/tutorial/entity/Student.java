package com.dailycodebuffer.spring.data.jpa.tutorial.entity;

/* @Auther: wuyang
 * @Date: 2023/01/15/21:12
 * @Description:
 */

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import java.util.logging.Logger;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table( name="tbl_student",uniqueConstraints = @UniqueConstraint(
        name = "email_unique",
        columnNames = "email_address")
)
public class Student {

    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence"
    )
    private Long studentId;
    private String firstName;
    private String lastname;
    @Column(name = "email_address",
            nullable = false)
    private String emailId;
    @Embedded
    private Guardian guardian; //guardian是嵌入class，只依赖于student存在
//    private String guardianName;
//    private String guardianEmail;
//    private String guardianMobile;

}
