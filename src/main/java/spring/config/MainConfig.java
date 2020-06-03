package spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import spring.pojo.Person;

@Controller
public class MainConfig {
	
	@Bean
	public Person person3(){
		return new Person();
	}
	
	
	
	
	
}
