package com.concerto.demos.SpringCoreDemo;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.concerto.demos.SpringCoreDemo.entity.Student;
import com.concerto.demos.SpringCoreDemo.service.StudentService;
@Configuration
@ComponentScan
@PropertySource("classpath:db.properties")
@EnableTransactionManagement
public class AppDB {

	public static void main(String[] args) throws Exception {
		AnnotationConfigApplicationContext context =
				new AnnotationConfigApplicationContext(AppDB.class);
		
		StudentService service = context.getBean(StudentService.class);
		System.out.println(service.getStudentCount());
		Student s1 = new Student(3, "Dummy");
		System.out.println(service.insertStudent(s1));
		//System.out.println(service.getStudentByRNo(1));
	}
	@Value("${driver}")
	private String driver;
	@Value("${url}")
	private String url;
	@Value("${username}")
	private String username;
	@Value("${password}")
	private String password;
	@Bean
	public DataSource dataSource() 
	{
		System.out.println("data source creating....");
		DriverManagerDataSource ds = new DriverManagerDataSource();
		System.out.println(driver);
		ds.setDriverClassName(driver);
		ds.setUrl(url);
		ds.setUsername(username);
		
		ds.setPassword(password);
		return ds;
		
	}

	@Bean
	public JdbcTemplate template(DataSource ds)
	{
		System.out.println("template creating....");
		return new JdbcTemplate(ds);
	}
}
