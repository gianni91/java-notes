package com.fezda.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApplication {

	/**********************************
	 * 1. Add these dependencies to the pom.xml between the <dependencies> tags (update version numbers if needed)
  	 *      <dependency> <!-- For running a web server -->
	 *			<groupId>org.springframework.boot</groupId>
	 *			<artifactId>spring-boot-starter-web</artifactId>
	 *			<version>2.7.5</version>
	 *		</dependency>
	 *		<dependency> <!-- For tests (e.g. JUnit) -->
	 *			<groupId>org.springframework.boot</groupId>
	 *			<artifactId>spring-boot-starter-test</artifactId>
	 *			<version>2.7.5</version>
	 *			<scope>test</scope>
	 *		</dependency>
	 *		<dependency> <!-- For accessing a database (e.g. MySQL) -->
	 *			<groupId>org.springframework.boot</groupId>
	 *			<artifactId>spring-boot-starter-data-jdbc</artifactId>
	 *			<version>2.7.5</version>
	 *		</dependency>
	 *    
	 * 3. Add 'src/main/resources/' package folder to the project, 
	 * 		and within it add a 'static' folder and an 'application.properties' file
	 * 
	 * 4. Set the database information in the application.properties file (See A10Databases.java notes for local DB setup)
	 * 		#Configure Database access
	 *		spring.datasource.url=jdbc:mysql://localhost:3306/jdbc_test
	 *		spring.datasource.username=jdbc_test_user
	 *		spring.datasource.password=your_psswd
	 *		spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
	 * 
	 * 5. Update the project (in Eclipse, right click project -> Maven -> Update project)
	 * 
	 * 6. Create application class like this one
	 * 
	 * 7. Create a controller class like MyControlled.java
	 * 
	 * 8. Run the application class as a Spring Boot application (right click on application class, Run as, ...)
	 * 
	 * 9. Open browser at http://localhost:8080/test to see output generated by function mapped to /test
	 * 10. Open browser at http://localhost:8080/db to see output generated by function mapped to /dbTest
	 * 11. Try other commands mapped in Controller class
	 *********************************/
	public static void main(String[] args) {
		SpringApplication.run(MyApplication.class, args);
	}

}
