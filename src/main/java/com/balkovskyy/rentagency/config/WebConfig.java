package com.balkovskyy.rentagency.config;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.http.MediaType;
import org.springframework.web.accept.ContentNegotiationManager;
import org.springframework.web.accept.ContentNegotiationStrategy;
import org.springframework.web.accept.FixedContentNegotiationStrategy;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.ContentNegotiatingViewResolver;
import org.springframework.web.servlet.view.json.MappingJackson2JsonView;

import com.balkovskyy.rentagency.config.rent_agency.JpaConfigurationRentAgency;
import com.balkovskyy.rentagency.settings.SettingsConfig;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.joda.JodaModule;


@Configuration
@EnableWebMvc
@ComponentScan({"com.balkovskyy.rentagency.web"})
@Import({SettingsConfig.class, JpaConfigurationRentAgency.class})
public class WebConfig extends WebMvcConfigurerAdapter{

	@Bean
    public ContentNegotiatingViewResolver viewResolver() {

        ContentNegotiatingViewResolver resolver = new ContentNegotiatingViewResolver();

        // Used strategy only for JSON
        FixedContentNegotiationStrategy fixedStrategy = new FixedContentNegotiationStrategy(MediaType.APPLICATION_JSON);
        Collection<ContentNegotiationStrategy> strategies = new ArrayList<ContentNegotiationStrategy>();
        strategies.add(fixedStrategy);
        resolver.setContentNegotiationManager(new ContentNegotiationManager(fixedStrategy));

        // Handle formatting of dates and JSON root elements
        ObjectMapper mapper = new ObjectMapper();
        mapper.configure(SerializationFeature.WRAP_ROOT_VALUE, false);
        mapper.configure(DeserializationFeature.UNWRAP_ROOT_VALUE, false);
        mapper.configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
        mapper.registerModule(new JodaModule());

        ArrayList<View> defaultViews = new ArrayList<View>();

        MappingJackson2JsonView jsonView = new MappingJackson2JsonView();
        jsonView.setObjectMapper(mapper);
        jsonView.setExtractValueFromSingleKeyModel(true);

        defaultViews.add(jsonView);
        resolver.setDefaultViews(defaultViews);

        resolver.setOrder(2);

        return resolver;
    }
}
