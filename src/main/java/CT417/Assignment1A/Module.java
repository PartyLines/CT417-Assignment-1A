package CT417.Assignment1A;

import java.util.ArrayList;
import java.util.List;

public class Module {
	
	private String name;
	private String id;
	private List<Student> students;
	private List<Course> courses;
	
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
	public List<Student> getStudents() {
		return students;
	}
	public List<Course> getCourses() {
		return courses;
	}
	
	public void addStudents(Student... students) {
		if (this.students == null) this.students = new ArrayList<>();
		for (Student s : students) {
			this.students.add(s);
			s.addModules(this);
		}
	}
	
	public void addCourses(Course... courses) {
		if (this.courses == null) this.courses = new ArrayList<>();
		for (Course c : courses) {
			this.courses.add(c);
		}
	}
}
