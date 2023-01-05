### Aspect Oriented Programming（AOP）

### @aspect注解无法添加
把pom.xml里面的<scope>runtime</scope>删除
<!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
<dependency>
    <groupId>org.aspectj</groupId>
    <artifactId>aspectjweaver</artifactId>
    <version>1.9.19</version>
    <scope>runtime</scope>
</dependency>

### AOP面向切面编程

[一篇文搞懂《AOP面向切面编程》是一种什么样的体验？](https://bbs.huaweicloud.com/blogs/289045?utm_source=zhihu&utm_medium=bbs-ex&utm_campaign=other&utm_content=content)

### afterReturning 
afterReturning用的时候要严格关注return的数据类型
[参考](https://stackoverflow.com/questions/20726737/aop-spring-afterreturning-not-working-as-expected)