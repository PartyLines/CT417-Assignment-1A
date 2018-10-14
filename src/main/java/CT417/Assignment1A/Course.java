package CT417.Assignment1A;

import java.util.ArrayList;
import java.util.List;

import org.joda.time.DateTime;

public class Course {
	
	private String name;
	private List<Student> students;
	private List<Module> modules;
	private DateTime startDate;
	private DateTime endDate;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<Student> getStudents() {
		return students;
	}
	public void setStudents(List<Student> students) {
		this.students = students;
	}
	public List<Module> getModules() {
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
		if (this.students == null) this.students = new ArrayList<>();
		for (Student s : students) {
			this.students.add(s);
			s.addCourses(this);
		}
	}
	
	public void addModules(Module... modules) {
		if (this.modules == null) this.modules = new ArrayList<>();
		for (Module m : modules) {
			this.modules.add(m);
			m.addCourses(this);
		}
	}
}
