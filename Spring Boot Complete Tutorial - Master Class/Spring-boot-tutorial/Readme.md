# [Spring Boot Complete Tutorial - Master Class](https://www.youtube.com/watch?v=zvR-Oif_nxg)

### Introduction
#### What is SpringBoot
#### Spring Initializer

[https://start.spring.io/](https://start.spring.io/)
- 打包时需要考虑Java版本

#### IDE
- [idea setting](/idea%20setting%20file)
#### Starters
		<dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-web</artifactId>
		</dependency>
#### Creating Simple API
- 主入口

        @SpringBootApplication
        public class SpringBootTutorialApplication {
        
            public static void main(String[] args) {
                SpringApplication.run(SpringBootTutorialApplication.class, args);
            }
        }
#### Devtools
- Provides fast application restarts, LiveReload, and configurations for enhanced development experience.
- 实现热部署
  1. 自动重启
  - spring-boot-devtools热部署是对修改的类和配置文件进行重新加载，所以在重新加载的过程中会看到项目启动的过程，其本质上只是对修改类和配置文件的重新加载，所以速度极快。
  - 原理：引入devtools之后，项目会用一个base类加载器来加载不改变的类，而会用restart类加载器来加载改变的类。当项目产生修改时，base类加载器不变化，而restart类会重建。类修改时，只对修改过的类重新加载，使得项目重新启动时速度极快。
  
  2. 缓存禁用
  - spring-boot-devtools 对于前端使用模板引擎的项目，能够自动禁用缓存，在页面修改后，只需要刷新浏览器器页面即可。
  - 缓存可以提高性能，但在有模板引擎的开发中，模板引擎会缓存编译过的模板，防止重复解析模板，这会导致修改页面内容时，模板引擎不去重新解析模板，看不到修改过的内容，但devtools在开发环境中默认关闭模板引擎的缓存功能。devtools不会被打包进jar包或war包中，在生产环境中，模板引擎的缓存功能就可以正常使用了。

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional>
        </dependency>
  - 
#### Architecture & Example
- Rest API(GET/POST/PUT/DELETE)
- Service API
- Data Access/Repository Layer
- Database

#### Adding Dependency H2 & JPA 
1. Spring Data Jpa
2. H2
    [http://localhost:8082/h2-console/](http://localhost:8082/h2-console/)

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-data-jpa</artifactId>
        </dependency>
		<dependency>
			<groupId>com.h2database</groupId>
			<artifactId>h2</artifactId>
			<scope>runtime</scope>
		</dependency>

#### Creating Components
- entity 实体类定义
- controller 跟前端交互，定义API，调用Service
- service 实现商务功能，调用repository
- repository 实现JPA，DB交互，[各种功能由JPA预先定义](https://docs.spring.io/spring-data/jpa/docs/current/reference/html/#appendix.query.method.subject)

#### Department Save API
    departmentRepository.save(department);
#### Testing API's using Rest Client
- Postman
#### Fetching data from DB
    departmentRepository.findAll();
#### Fetching Data by ID
    departmentRepository.findById(departmentId);
#### Deleting Data
    departmentRepository.deleteById(departmentId);
#### Updating Data
    @Override
    public Department updateDepartment(Long departmentId, Department department) {

        Department depDB = departmentRepository.findById(departmentId).get();

        if(Objects.nonNull(department.getDepartmentName()) &&
        !"".equalsIgnoreCase(department.getDepartmentName())) {
            depDB.setDepartmentName(department.getDepartmentName());
        }
        if(Objects.nonNull(department.getDepartmentCode()) &&
                !"".equalsIgnoreCase(department.getDepartmentCode())) {
            depDB.setDepartmentCode(department.getDepartmentCode());
        }
        if(Objects.nonNull(department.getDepartmentAddress()) &&
                !"".equalsIgnoreCase(department.getDepartmentAddress())) {
            depDB.setDepartmentAddress(department.getDepartmentAddress());
        }
        return departmentRepository.save(depDB);
    }
#### Fetch Data by Name
- Service定义


    @Override
    public Department fetchDepartmentByName(String departmentName) {
        return departmentRepository.findByDepartmentNameIgnoreCase(departmentName);
    }
- Repository 需要单独定义


    @Repository
    public interface  DepartmentRepository extends JpaRepository<Department,Long> {
    public Department findByDepartmentName(String departmentName);
    
        public Department findByDepartmentNameIgnoreCase(String departmentName);
    
    }
#### Hibernate Validation

        <dependency>
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-validation</artifactId>
        </dependency>

#### Adding Loggers
#### Project Lombok
#### Handling Exception
#### Changing H2 -> MySQL

#### Unit Testing. Concept of testing
#### Unit Testing. Service Layer
#### Unit Testing. Repository Layer
#### Unit Testing. Controller Layer

#### Adding Config in properties file
#### Adding application.yml

#### Profiles
#### Running SpringBoot with multiple Profiles

#### Actuator
#### Custom Actuator Endpoint
#### Exclude Actuator Edpoint