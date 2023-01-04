package Demo;

/* @Auther: wuyang
 * @Date: 2023/01/02/14:00
 * @Description:
 */

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff, BeanNameAware {
//
    private String qualification;

    @Override
    public String toString() {
        return "Doctor{" +
                "qualification='" + qualification + '\'' +
                '}';
    }

    //
//    /*  如果不想用value来注入初期化值，需要用constructor
//     * */
//    public Doctor(String qualification) {
//        this.qualification = qualification;
//    }


    public void assist() {
        System.out.println("Doctor is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    @Override
    public void setBeanName(String s) {
        System.out.println("Set Bean Name method is called.");
    }

    @PostConstruct
    public void postConstruct(){
        System.out.println("Post Construct Method is called.");
    }
//
//    public String getQualification() {
//        return qualification;
//    }
//
//    public void setQualification(String qualification) {
//        this.qualification = qualification;
//    }
}
