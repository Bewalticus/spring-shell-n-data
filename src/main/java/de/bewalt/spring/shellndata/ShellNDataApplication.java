package de.bewalt.spring.shellndata;

import javax.sql.DataSource;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@SpringBootApplication
public class ShellNDataApplication {
  
  private static String dbFileName;

	public static void main(String[] args) {
	  dbFileName = args[0];
		SpringApplication.run(ShellNDataApplication.class, args);
	}
	
	@Bean
	public DataSource getDataSource() {
	  System.out.println("Retrieving Datasource");
    DriverManagerDataSource dataSource = new DriverManagerDataSource();
    dataSource.setDriverClassName("org.hsqldb.jdbc.JDBCDriver");
    dataSource.setUrl("jdbc:hsqldb:file:" + dbFileName + ";shutdown=true");
    dataSource.setUsername("SA");
    dataSource.setPassword("");
    
    return dataSource;	}
}
