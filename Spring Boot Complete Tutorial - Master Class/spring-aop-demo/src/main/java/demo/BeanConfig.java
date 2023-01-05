package demo;

/* @Auther: wuyang
 * @Date: 2023/01/05/21:59
 * @Description:
 */

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "demo")
@EnableAspectJAutoProxy
public class BeanConfig {
}
