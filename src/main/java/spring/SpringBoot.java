package spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import spring.pojo.Person;

@SpringBootApplication
public class SpringBoot {
	public static void main(String[] args) {
		SpringApplication.run(SpringBoot.class, args);
	}
	
	
	@Bean
	public Person person1(){
		return new Person();
	}
	
	
	@Bean("person")
	public Person person2(){
		return new Person();
	}
	
	
	
	
	
	
	
}
