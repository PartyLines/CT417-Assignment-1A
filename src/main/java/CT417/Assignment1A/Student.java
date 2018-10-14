package CT417.Assignment1A;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;
import org.joda.time.Years;

/**
 * Student Class
 *
 */
public class Student {
	private String name;
	private DateTime dateOfBirth;
	//Could potentially use LocalDate here, but DateTime is in requirements
	private String id; 
	//While student ID is numeric in NUIG, it could have letters in other universities
	private Set<Module> modules;
	private Set<Course> courses;
	

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return Years.yearsBetween(dateOfBirth, DateTime.now()).getYears();
		//Age is extrapolated from date of birth compared to now
	}
	public DateTime getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(DateTime dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUsername() {
		return name.replaceAll(" ", "") + getAge();
	}
	public Set<Module> getModules() {
		return modules;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	
	public void addModules(Module... modules) {
		if (this.modules == null) this.modules = new HashSet<>();
		for (Module m : modules) {
			this.modules.add(m);
		}
	}
	
	public void addCourses(Course... courses) {
		if (this.courses == null) this.courses = new HashSet<>();
		for (Course c : courses) {
			this.courses.add(c);
		}
	}
	
	
}
