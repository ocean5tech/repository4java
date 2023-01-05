package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/* @Auther: wuyang
 * @Date: 2023/01/05/21:34
 * @Description:
 */
public class Main {
    public static void main(String[] args) {
        ApplicationContext context
                = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart cart = context.getBean(ShoppingCart.class);
        cart.checkout("CANCELLED");
        cart.quantity();
        System.out.println("The End");
    }
}
