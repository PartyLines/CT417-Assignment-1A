package CT417.Assignment1A;

import java.util.HashSet;
import java.util.Set;

import org.joda.time.DateTime;

public class Course {
	
	private String name;
	private Set<Student> students;
	private Set<Module> modules;
	private DateTime startDate;
	private DateTime endDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Student> getStudents() {
		return students;
	}
	public void setStudents(Set<Student> students) {
		this.students = students;
	}
	public Set<Module> getModules() {
		return modules;
	}
	public DateTime getStartDate() {
		return startDate;
	}
	public void setStartDate(DateTime startDate) {
		this.startDate = startDate;
	}
	public DateTime getEndDate() {
		return endDate;
	}
	public void setEndDate(DateTime endDate) {
		this.endDate = endDate;
	}
	
	public void addStudents(Student... students) {
		if (this.students == null) this.students = new HashSet<>();
		for (Student s : students) {
			this.students.add(s);
			s.addCourses(this);
		}
	}
	
	public void addModules(Module... modules) {
		if (this.modules == null) this.modules = new HashSet<>();
		for (Module m : modules) {
			this.modules.add(m);
			m.addCourses(this);
		}
	}
}
