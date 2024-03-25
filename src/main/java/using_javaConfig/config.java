package using_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "using_javaConfig")
public class config {

	@Bean
	public Person person() {
		return new Person("Momo");
	}
	
	@Bean
	public User user() {
		return new User(person(), "admin");
	}
}
