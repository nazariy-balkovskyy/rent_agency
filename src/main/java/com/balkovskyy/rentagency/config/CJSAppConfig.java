package com.balkovskyy.rentagency.config;

import liquibase.integration.spring.SpringLiquibase;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.balkovskyy.rentagency.settings.SettingsConfig;

@Configuration
@Import(SettingsConfig.class)
@ComponentScan({
        "com.balkovskyy.rentagency.config",
        "com.balkovskyy.rentagency.config.rent_agency"
})
public class CJSAppConfig {

    @Autowired
    @Qualifier("rentAgencyDataSource")
    private javax.sql.DataSource rentAgencyDataSource;

    @Bean
    public SpringLiquibase liquibasePcCloud() {
        SpringLiquibase result = new SpringLiquibase();
        result.setDataSource(rentAgencyDataSource);
        result.setChangeLog("classpath:/com/balkovskyy/rentagency/db/changelog/rent_agencypcCloudDB.changelog-master.xml");
        return result;
    }
}
