package Demo;

import org.springframework.stereotype.Component;

/* @Auther: wuyang
 * @Date: 2023/01/04/21:30
 * @Description:
 */
@Component
public class Nurse implements Staff {
    public void assist() {
        System.out.println("Nurse is assisting");
    }
}
