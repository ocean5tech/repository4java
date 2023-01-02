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
4. 
