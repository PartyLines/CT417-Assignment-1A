package CT417.Assignment1A;

import java.util.HashSet;
import java.util.Set;

public class Module {
	
	private String name;
	private String id;
	private Set<Student> students;
	private Set<Course> courses;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public Set<Course> getCourses() {
		return courses;
	}
	
	public void addStudents(Student... students) {
		if (this.students == null) this.students = new HashSet<>();
		for (Student s : students) {
			this.students.add(s);
			s.addModules(this);
		}
	}
	
	public void addCourses(Course... courses) {
		if (this.courses == null) this.courses = new HashSet<>();
		for (Course c : courses) {
			this.courses.add(c);
		}
	}
}
