package using_javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.ResourceBundleMessageSource;


@Configuration
@ComponentScan(basePackages = "using_javaConfig")
@PropertySource("data.properties")
public class config {

//	@Bean
//	public Person person() {
//		return new Person();
//	}
//	
//	@Bean
//	public User user() {
//		return new User();
//	}
	
	@Bean(name="messageSource")
	public ResourceBundleMessageSource bundleMessageSource() {
	ResourceBundleMessageSource messageSource = new ResourceBundleMessageSource();
	messageSource.setBasename("messages");
	return messageSource;
	}
}
