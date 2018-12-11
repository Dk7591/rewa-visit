package com.shoppingbackend.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.apache.commons.dbcp2.BasicDataSource;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan(basePackages={"com.shoppingbackend.dto"})
@EnableTransactionManagement
public class HibernateConfig {

	private final static String DATABASE_URL="jdbc:h2:tcp://localhost/~/rewavisit";
	private final static String DATABASE_DRIVER="org.h2.Driver";
	private final static String DATABASE_DIALECT="org.hibernate.dialect.H2Dialect";
	private final static String DATABASE_USERNAME="sa";
	private final static String DATABASE_PASSWORD="";
	
	
	//Creating bean
	@Bean
	public DataSource getDataSource(){
		
		BasicDataSource dataSource=new BasicDataSource();
//		DATABASE CONNECTION INFO
		dataSource.setDriverClassName(DATABASE_DRIVER);
		dataSource.setUrl(DATABASE_URL);
		dataSource.setUsername(DATABASE_USERNAME);
		dataSource.setPassword(DATABASE_PASSWORD);
		return dataSource;
		
	}
	
	
//	SessionFactory Bean
	
	
	@Bean
	public SessionFactory getSessionFactory(DataSource dataSource)
	{
		LocalSessionFactoryBuilder builder=new LocalSessionFactoryBuilder(dataSource);
		builder.addProperties(getHibernateProperties());
		builder.scanPackages("com.shoppingbackend.dto");
		return builder.buildSessionFactory();
	}

//all the hibernate properties will be return in this method
private Properties getHibernateProperties() {
	Properties properties=new Properties();
	properties.put("hibernate.dialect",DATABASE_DIALECT);
	properties.put("hibernate.show_sql",true);
	properties.put("hibernate.formate_sql",true);
	
	return properties;
	
}


//Hibernate Bean transaction manager
@Bean
public HibernateTransactionManager getTransactionManager(SessionFactory sessionFactory)
{
	HibernateTransactionManager transactionManager=new HibernateTransactionManager(sessionFactory);
	return transactionManager;
}
}
