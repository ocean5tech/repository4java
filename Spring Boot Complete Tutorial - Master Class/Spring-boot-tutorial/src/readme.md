### 问题
Project可以直接执行，也能正确表示网页，但是mvn install和mvn spring-boot:run错误
java: class file has wrong version 61.0, should be 55.0

### 解决
两步处理：
 - 第一步：SDK设定：  
 - setting->build->build tools->maven
 - setting->build->compiler->java compiler-> sdk version
 - project stature -> project -> sdk
 - 第二步：改用clean install
 - mvn clean install -U
 - mvn spring-boot:run