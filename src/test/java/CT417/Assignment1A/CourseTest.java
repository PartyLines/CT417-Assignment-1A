package CT417.Assignment1A;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CT417.Assignment1A.Student;

/**
 * Unit test for simple App.
 */
public class CourseTest 
{

    @Test
    public void courseObjectTest()
    {
    	Course CourseOne = new Course();
    	Module m = new Module();
    	CourseOne.addModules(m);
    	CourseOne.addModules(new Module(), new Module());
    	new Course().addModules(m);
    	
    	assertEquals(3, CourseOne.getModules().size());
    	assertEquals(2, m.getCourses().size());
    	
    	Student s = new Student();
    	CourseOne.addStudents(s);
    	CourseOne.addStudents(new Student(), new Student());
    	
    	new Course().addStudents(s);
    	//Many of these empty Course/course/student objects are to ensure branch coverage and that varargs work as expected.
    	
    	assertEquals(3, CourseOne.getStudents().size());
    	assertEquals(2, s.getCourses().size());
    }
}
