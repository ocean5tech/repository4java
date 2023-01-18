

[面向切面编程AOP](https://zhuanlan.zhihu.com/p/67577468)


### 定义
AOP(Aspect Oriented Programming）中文翻译为面向切面编程，是指通过预编译方式和运行期动态代理实现程序中某些功能的统一维护的一种技术。
这门技术有什么好处呢？自然是降低程序各个部分之间的耦合度。

### 目的
理论上程序中任何公共处理的逻辑，都可以独立出来用AOP实现，一般在工程实际中用AOP是为了实现系统级服务与应用的业务逻辑之间的彻底分离。这样一来，就不用在业务代码中插满各种乱七八糟的系统分析代码了。


### 字符串，数组
都是引用类型，不是基本类型，相当于一个指针

用equals来比较字符串内容，并用s1 != null来避免NullPointerException错误

            public class Main {
                public static void main(String[] args) {
                    String s1 = null;
                    if (s1 != null && s1.equals("hello")) {
                        System.out.println("hello");
                    }
                }
            }
