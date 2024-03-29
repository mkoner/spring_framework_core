package using_javaConfig;



import java.util.Date;
import java.util.Locale;

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
		
		Locale english = Locale.ENGLISH;
		Locale french = Locale.FRENCH;
		Object[] object =  new Object[] {"Mamadou", new Date()};
		System.out.println("================ENGLISH==========");
		System.out.println(context.getMessage("msg", null, english));
		System.out.println(context.getMessage("paramMesg", object, english));
		
		System.out.println("================FRENCH==========");
		System.out.println(context.getMessage("msg", null, french));
		System.out.println(context.getMessage("paramMesg", object, french));

	}

}
