package demo;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/* @Auther: wuyang
 * @Date: 2023/01/05/22:16
 * @Description:
 */
@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* demo.ShoppingCart.checkout(..))")
    public void beforlogger(JoinPoint joinPoint){
        System.out.println(joinPoint.getSignature());
        System.out.println("Before Logger with Argument: ");
        System.out.println(joinPoint.getArgs()[0].toString());
        System.out.println("Before Logger");
    }
    @After("execution(* *.*.checkout(..))")
    public void afterlogger(){
        System.out.println("After Logger");
    }

    @Pointcut("execution(java.lang.String *.*.quantity())")
    public void afterReturningPointCut(){}

    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(String retVal){
        System.out.println("After Returning: ");
        System.out.println(retVal);
    }

}
