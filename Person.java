import javax.swing.JLabel;

public class Person {
	private String username;
	private String password;
	private String name;
	private String email;
	
	public Person() {
		
	}
	
	public Person(String username, String string, String name2, String email2) {
		this.username = username;
		this.password = string;
		this.name = name2;
		this.email = email2;			
		}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String toString() {
		return "\n" + "Name : " + getName() + "\nEmail : " + getEmail() ;
	}

}
