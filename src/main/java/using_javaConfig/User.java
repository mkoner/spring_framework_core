package using_javaConfig;

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
	public void setPerson(Person person) {
		this.person = person;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "User [person=" + person + ", role=" + role + "]";
	}
	
	
}
