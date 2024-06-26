package using_annotations;

import java.util.Date;
import java.util.Locale;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		// use exclusively annotation
		ApplicationContext context = new AnnotationConfigApplicationContext("using_annotations");
		Product product = context.getBean("product", Product.class);
		System.out.println(product);
		
	}
}
