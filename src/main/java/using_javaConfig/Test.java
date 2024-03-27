package using_javaConfig;



import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		User user = context.getBean("user", User.class);
		System.out.println(user);
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		Person person1 = context.getBean("person", Person.class);
		System.out.println(person == person1);

	}

}
