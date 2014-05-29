package com.balkovskyy.rentagency.config.rent_agency;
import javax.sql.DataSource;



import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class MySQLDatabaseConfigRentAgency {

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.url}")
	private String dbUrl;

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.user}")
	private String dbUser;

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.password}")
	private String dbPassword;

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.driver}")
	private String dbDriverName;

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.initialSize}")
	private int initialSize;

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.validationQuery}")
	private String validationQuery;

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.testWhileIdle}")
	private boolean testWhileIdle;

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.timeBetweenEvictionRunsMillis}")
	private int timeBetweenEvictionRunsMillis;

	@Value("${com.balkovskyy.rentagency.config.rent_agency.db.minEvictableIdleTimeMillis}")
	private int minEvictableIdleTimeMillis;

	@Bean
	public DataSource rentAgencyDataSource(){
		BasicDataSource ds = new BasicDataSource();
		ds.setUsername(dbUser);
		ds.setPassword(dbPassword);
		ds.setUrl(dbUrl);
		ds.setDriverClassName(dbDriverName);

		ds.setInitialSize(initialSize);
		ds.setValidationQuery(validationQuery);
		ds.setTestWhileIdle(testWhileIdle);
		ds.setTimeBetweenEvictionRunsMillis(timeBetweenEvictionRunsMillis);
		ds.setMinEvictableIdleTimeMillis(minEvictableIdleTimeMillis);
		return ds;
	}

}
