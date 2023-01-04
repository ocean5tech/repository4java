1. Create Project: org.apache.maven.archetypes:maven-archetype-archetype
2. CreateProject会新打开一个窗口
                
        <?xml version="1.0" encoding="UTF-8"?>
        <project xmlns="http://maven.apache.org/POM/4.0.0"
        xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
        <modelVersion>4.0.0</modelVersion>
    
            <groupId>com.dailycodebuffer</groupId>
            <artifactId>SpringFrameworkDemo</artifactId>
            <version>1.0-SNAPSHOT</version>
    
        <properties>
            <maven.compiler.source>11</maven.compiler.source>
            <maven.compiler.target>11</maven.compiler.target>
            <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
        </properties>
    
        </project>


3. 过一会就变成了

        <project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
        xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/maven-v4_0_0.xsd">
        <modelVersion>4.0.0</modelVersion>
        <groupId>com.dailycodebuffer</groupId>
        <artifactId>SpringFrameworkDemo</artifactId>
        <version>1.0-SNAPSHOT</version>
        <name>Archetype - SpringFrameworkDemo</name>
        <url>http://maven.apache.org</url>
        </project>
4. 如果有dependencies背景变黄，或者字体变红，是没有下载Maven依赖项
  4-1. 去这里确认依赖项写的正确 https://mvnrepository.com/
  4-2. 进入项目文件夹后执行 mvn install 命令
5. 如果有dependencies背景变黄，或者字体变红，右键点击pom.xml，Maven -> Reload Project
6. 建立spring.xml的时候去google "spring bean xml"
7.  "spring.xml"直接写就行，不用在前面写configLocation,可以自动加

        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
8. 总结
主要知识点
  - Bean的定义方式，可以XML，可以Annotation，可以Config
  - Bean的Scope
  - Bean的生命周期