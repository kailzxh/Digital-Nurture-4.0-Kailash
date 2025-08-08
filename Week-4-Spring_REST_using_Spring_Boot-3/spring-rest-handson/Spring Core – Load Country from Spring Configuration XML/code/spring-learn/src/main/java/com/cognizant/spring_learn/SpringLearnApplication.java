package com.cognizant.spring_learn;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class SpringLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(SpringLearnApplication.class);

	public static void main(String[] args) {
		LOGGER.info("START");
		displayCountries();
		LOGGER.info("END");
	}

	public static void displayCountries() {
		ApplicationContext context = new ClassPathXmlApplicationContext("country.xml");
		@SuppressWarnings("unchecked")
		List<Country> countryList = (List<Country>) context.getBean("countryList");
		for (Country country : countryList) {
			LOGGER.debug("Country: {}", country);
		}
	}
}
