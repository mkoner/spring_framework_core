package using_javaConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class User {
	private Person person;
	private String role;
	public User() {
	}
	public User(Person person, String role) {
		this.person = person;
		this.role = role;
	}
	public Person getPerson() {
		return person;
	}
	@Autowired
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getRole() {
		return role;
	}
	@Value("${userRole}")
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [person=" + person + ", role=" + role + "]";
	}
	
	
}
