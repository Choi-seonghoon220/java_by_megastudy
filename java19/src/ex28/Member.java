package ex28;

import java.io.Serializable;

public class Member implements Serializable {
	private static final long serialVersionUID = 1L;

	String name, id;
	transient String password;
	
	public Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}
	public String toString() {
		return name + " " + id + " " + password;
	}
}
