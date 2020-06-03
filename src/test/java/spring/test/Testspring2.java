package spring.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import spring.pojo.Person;
@RunWith(SpringRunner.class)
@SpringBootTest
public class Testspring2 {
	
	@Autowired
	ApplicationContext context;
	
	@Test
	public void test1(){
		//通过名字获取Bean,返回值类型是Object
		Object bean = context.getBean("person1");
		System.out.println(bean);
	}
	
	
	@Test
	public void test2(){
		//通过类型获取Bean,返回值类型对应类型.注意：如果当容器中有多个这样类型的Bean，会抛出异常
		Person bean = context.getBean(Person.class);
		System.out.println(bean);
	}
	
	
	@Test
	public void test3(){
		//通过类型获取Bean,返回值类型对应类型.注意：如果当容器中有多个这样类型的Bean，会抛出异常
		 Object bean = context.getBean("person");
		System.out.println(bean);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
