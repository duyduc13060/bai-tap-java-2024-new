package model;

//bang user
public class UserCreate {
	
	private int userId;
	private String username;
	private String password;
	private String name;
	private String phoneNumber;
	
//	private String role;
	
	public UserCreate() {
		// TODO Auto-generated constructor stub
	}

public UserCreate(int userId, String username, String password, String name, String phoneNumber) {
	super();
	this.userId = userId;
	this.username = username;
	this.password = password;
	this.name = name;
	this.phoneNumber = phoneNumber;
}

public int getUserId() {
	return userId;
}

public void setUserId(int userId) {
	this.userId = userId;
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

public String getPhoneNumber() {
	return phoneNumber;
}

public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

@Override
public String toString() {
	return "UserCreate [userId=" + userId + ", username=" + username + ", password=" + password + ", name=" + name
			+ ", phoneNumber=" + phoneNumber + "]";
}
	
	
}
