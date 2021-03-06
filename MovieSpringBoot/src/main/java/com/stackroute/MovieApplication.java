package com.stackroute;

import com.stackroute.domain.Movie;
import com.stackroute.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ApplicationListener;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.validation.beanvalidation.LocalValidatorFactoryBean;

@SpringBootApplication
@EnableEurekaClient
@EnableDiscoveryClient
//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
public class MovieApplication implements ApplicationListener<ContextRefreshedEvent>, CommandLineRunner {


	MovieRepository movieRepository;

	@Autowired
	public MovieApplication(MovieRepository movieRepository){
		this.movieRepository=movieRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(MovieApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Movie movie = new Movie("1", 5,  "dicaprio could have lived","TitanicsaA");
		movieRepository.save(movie);

	}

	@Override
	public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
		Movie movie = new Movie("4", 5,"asfasda lived", "zysadasdasx" );
		movieRepository.save(movie);
		movie = new Movie("2", 5, "asdasd", "ssdasdasaf");
		movieRepository.save(movie);
//		movie = new Movie("asadasdadf", "3", 5, "wresdasdasaq");
//		movieRepository.save(movie);
//		movie = new Movie("Titanasdaic", "5", 5, "dicaprio could have lived");
//		movieRepository.save(movie);
	}

	@Bean
	public LocalValidatorFactoryBean validator(MessageSource messageSource){
		LocalValidatorFactoryBean validatorFactoryBean = new LocalValidatorFactoryBean();
		validatorFactoryBean.setValidationMessageSource(messageSource);
		return validatorFactoryBean;
	}

}
