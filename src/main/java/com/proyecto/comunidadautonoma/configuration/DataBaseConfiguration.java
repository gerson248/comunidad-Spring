package com.proyecto.comunidadautonoma.configuration;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


// conexion a BD
@Configuration //
@EnableTransactionManagement // Nos ayudara en la aprte de las transacciones,
//nos indicara que todas las ccioens a la BD se ejecuten de modo transaccional 
public class DataBaseConfiguration {
	
	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean  sessionFactoryBean = new LocalSessionFactoryBean();
		sessionFactoryBean.setDataSource(dataSource());
		sessionFactoryBean.setPackagesToScan("com.proyecto.comunidadautonoma.model");
		sessionFactoryBean.setHibernateProperties(hibernateProperties());
		return sessionFactoryBean;
	}
	
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/proyec?serverTimezone=UTC");
		dataSource.setUsername("proyec");
		dataSource.setPassword("proyec");
		
		return dataSource;
	}
	
	public Properties hibernateProperties() {
		Properties properties = new Properties();
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		properties.put("show_sql", "true");
		
		return properties;
	}
	
	@Bean
	@Autowired
	public HibernateTransactionManager transactionManager() {
		HibernateTransactionManager hibernateTransactionManager = new HibernateTransactionManager();
		hibernateTransactionManager.setSessionFactory(sessionFactory().getObject());
		return hibernateTransactionManager;
	}
}
