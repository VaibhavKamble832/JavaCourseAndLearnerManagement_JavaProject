package javaCourseProject;

public class Student {
	private String name, contact, email, username, password;
	private int count;

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}

	public Student(String name, String contact, String email, String username, String password, int count) {
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.username = username;
		this.password = password;
		this.count = count;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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

	public String toString() {
		return name + " " + contact + " " + email + " " + username + " " + password;
	}
}