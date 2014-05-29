package com.balkovskyy.rentagency.config;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.balkovskyy.rentagency.config.rent_agency.JpaConfigurationRentAgency;

@Configuration
@EnableJpaRepositories
@EnableTransactionManagement
@Import({ CJSAppConfig.class, JpaConfigurationRentAgency.class})
public class AppConfig {

}
