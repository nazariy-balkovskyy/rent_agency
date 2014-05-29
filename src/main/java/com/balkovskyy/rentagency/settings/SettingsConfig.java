package com.balkovskyy.rentagency.settings;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

@Configuration
public class SettingsConfig implements ApplicationContextAware {

	private static final String LOCAL_FILE_SETTINGS_PROP_NAME = "com.knowledgevision.settings.localFileSettings";

	private static final Logger LOGGER = Logger.getLogger(SettingsConfig.class);

	@Bean
	public PropertyPlaceholderConfigurer properties() throws IOException {
		PropertyPlaceholderConfigurer ppc = new PropertyPlaceholderConfigurer();
		ppc.setSystemPropertiesMode(PropertyPlaceholderConfigurer.SYSTEM_PROPERTIES_MODE_OVERRIDE);
		Properties inJarSettings = loadLocalProperties();
		Properties locallyOverridedSettings = loadLocalOverrides();

		Properties settings = new Properties(inJarSettings);
		if (!locallyOverridedSettings.isEmpty()) {
			settings.putAll(locallyOverridedSettings);
		}

		ppc.setProperties(settings);
		List<Resource> resources = new ArrayList<Resource>();
		if (!resources.isEmpty()) {
			ppc.setLocations(resources.toArray(new Resource[resources.size()]));
		}
		ppc.setIgnoreResourceNotFound(true);
		return ppc;
	}

	private Properties loadLocalOverrides() {
		Properties result = new Properties();
		if (System.getProperties().containsKey(LOCAL_FILE_SETTINGS_PROP_NAME)) {
			String fileName = System.getProperties().getProperty(LOCAL_FILE_SETTINGS_PROP_NAME);
			try {
				result.load(new FileInputStream(fileName));

			}
			catch (IOException e) {
				LOGGER.warn(String.format("Failed to load settings from file %s: %s", fileName, e.getMessage()));
			}
		}
		return result;
	}

	private Properties loadLocalProperties() throws IOException {
		Properties result = new Properties();
		for (String propertiesPath : Arrays.asList("/com/balkovskyy/rentagency/config/rentagencyweb.properties")) {
			result.putAll(loadLocalProperties(propertiesPath));
		}
		return result;
	}


	private Properties loadLocalProperties(
			String propertiesPath) throws IOException {
		Properties result = new Properties();
		InputStream resourceAsStream = getClass().getResourceAsStream(propertiesPath);
		if (resourceAsStream != null) {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(String.format("Loading local properties %s...", propertiesPath));
			}
			result.load(resourceAsStream);

			if (LOGGER.isDebugEnabled()) {
				LOGGER.debug(String.format("Loading local properties %s finished. Total properties count: %s", propertiesPath, result.size()));
			}
		}
		else {
			if (LOGGER.isDebugEnabled()) {
				LOGGER.warn(String.format("Local properties %s was not found. Skipped.", propertiesPath));
			}
		}
		return result;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) {
		applicationContext.getEnvironment().getDefaultProfiles();
	}

}