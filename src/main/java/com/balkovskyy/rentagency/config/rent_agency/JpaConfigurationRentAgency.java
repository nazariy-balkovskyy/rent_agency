package com.balkovskyy.rentagency.config.rent_agency;
import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.hibernate.cache.HashtableCacheProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate4.HibernateExceptionTranslator;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@EnableJpaRepositories(
		entityManagerFactoryRef="rentAgencyEntityManagerFactory",
		transactionManagerRef="transactionManagerRentAgency",
		basePackages = {
				"com.balkovskyy.rentagency.web.repositories"})
@ComponentScan({"com.balkovskyy.rentagency.config.rent_agency"})
@Import({ MySQLDatabaseConfigRentAgency.class })
public class JpaConfigurationRentAgency {

	@Autowired
	@Qualifier("rentAgencyDataSource")
	private DataSource dataSource;

	@Value("${com.balkovskyy.rentagency.web.config.rent_agency.hibernate.dialect}")
	private String hibernateDialect;

	@Bean
	public EntityManagerFactory rentAgencyEntityManagerFactory() {
		HibernateJpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		vendorAdapter.setGenerateDdl(true);
		vendorAdapter.setShowSql(true);
		vendorAdapter.setGenerateDdl(false);
		vendorAdapter.setDatabase(Database.MYSQL);

		Properties jpaProperties = new Properties();
		jpaProperties.put("hibernate.dialect", hibernateDialect);
		jpaProperties.put("hibernate.cache.provider_class",
				HashtableCacheProvider.class.getName());

		LocalContainerEntityManagerFactoryBean factory = new LocalContainerEntityManagerFactoryBean();
		factory.setJpaVendorAdapter(vendorAdapter);
		factory.setJpaProperties(jpaProperties);
		factory.setDataSource(dataSource);
		factory.setPersistenceUnitName("rent_agency");
		factory.afterPropertiesSet();

		return factory.getObject();
	}

	@Bean 
    public HibernateExceptionTranslator hibernateExceptionTranslator(){ 
      return new HibernateExceptionTranslator(); 
    }

	@Bean
	public PlatformTransactionManager transactionManagerRentAgency() {
		return new JpaTransactionManager(rentAgencyEntityManagerFactory());
	}

}
