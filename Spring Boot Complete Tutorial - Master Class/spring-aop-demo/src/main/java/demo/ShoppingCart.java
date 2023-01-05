package demo;

import org.springframework.stereotype.Component;

/* @Auther: wuyang
 * @Date: 2023/01/05/21:47
 * @Description:
 */
@Component
public class ShoppingCart {
    public void checkout(String status){
        //logging

        System.out.println("Checkout Method from ShoppingCart Called.");

    }

    public String quantity() {
        System.out.println("quantity is called");
        return "S2";
    }

}
