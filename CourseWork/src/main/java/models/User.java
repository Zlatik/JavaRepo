package models;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.concurrent.atomic.*;

@Entity
@Table(name = "User")
public class User implements Serializable{


	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "id")
	@GeneratedValue
	public static final AtomicLong count = new AtomicLong(0);
	private long id = 0;
	@Column(name = "login")
	private String login;
	@Column(name = "password")
	private String password;
	@Column(name = "username")
	private String username;
	@Column(name = "age")
	private int age;
	public User(String login, String password, String username, int age) {
		this.login = login;
		this.password = password;
		this.username = username;
		this.age = age;
		id = count.incrementAndGet();
	}
	public User() {
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public long getId() {
		return id;
	}
	
	
}
