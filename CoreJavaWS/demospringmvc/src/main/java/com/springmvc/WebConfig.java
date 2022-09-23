package com.springmvc;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan
@PropertySource("classpath:db.properties")
public class WebConfig implements WebMvcConfigurer {
	
	@Autowired
	Environment env;
	
	public WebConfig() {
		System.out.println("Web config constructor");
	}
	@Bean
	public InternalResourceViewResolver viewResolver() {
	InternalResourceViewResolver vr = new InternalResourceViewResolver();
	// set location of views.
	vr.setPrefix("/");
	// set the extension of views.
	vr.setSuffix(".jsp");
	return vr; }
	
//	@Value("${driver}")
//	private String driver;
//	@Value("${url}")
//	private String url;
//	@Value("${username}")
//	private String username;
//	@Value("${password}")
	private String password;
	@Bean
	public DataSource dataSource() 
	{
		System.out.println("data source creating.... "+env.getProperty("driver"));
		DriverManagerDataSource ds = new DriverManagerDataSource();
		//System.out.println(driver);
//		ds.setDriverClassName(driver);
//		ds.setUrl(url);
//		ds.setUsername(username);
//		
//		ds.setPassword(password);
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:8889/concerto");
		ds.setUsername("root");
		
		ds.setPassword("root");
		return ds;
		
	}

	@Bean
	@Autowired
	public JdbcTemplate template(DataSource ds)
	{
		System.out.println("template creating....");
		return new JdbcTemplate(ds);
	}
	

}
