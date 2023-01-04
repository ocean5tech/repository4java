package Demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* @Auther: wuyang
 * @Date: 2023/01/02/13:54
 * @Description:
 */
public class Main {
    public static void main(String[] args) {

//        ApplicationContext context =
//                new ClassPathXmlApplicationContext("spring.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);

        // Doctor doctor = new Doctor();
        Doctor doctor = context.getBean(Doctor.class); // 用这个来代替 new Doctor()
        doctor.assist();
        doctor.setQualification("MBB");
//        System.out.println(doctor);
//
//        Doctor doctor1 = context.getBean(Doctor.class);
//        System.out.println(doctor1);

    }
}
