package demo;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/* @Auther: wuyang
 * @Date: 2023/01/05/23:20
 * @Description:
 */
@Aspect
@Component
public class AuthenticationAspect {
    @Pointcut("within(demo..*)")
    public void authenticatingPointCut(){
    }
    @Pointcut("within(demo..*)")
    public void authorizationPointCut(){
    }
    @Before("authenticatingPointCut() && authorizationPointCut()")
    public void authenticate(){
        System.out.println("authenticating the Request");
    }

}
