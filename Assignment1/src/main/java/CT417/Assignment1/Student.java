package CT417.Assignment1;

import org.joda.time.DateTime;

/**
 * Student Class
 *
 */
public class Student {
	private String name;
	private int age;
	private DateTime dateOfBirth;
	private String id; 
	//While student ID is numeric in NUIG, it could have letters in other universities

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getID() {
		return id;
	}
	public void setID(String iD) {
		id = iD;
	}
	
	public String getUsername() {
		return name.replaceAll(" ", "") + age;
	}
}
