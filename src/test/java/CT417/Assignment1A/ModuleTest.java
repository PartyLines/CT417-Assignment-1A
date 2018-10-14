package CT417.Assignment1A;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import CT417.Assignment1A.Student;

/**
 * Unit test for simple App.
 */
public class ModuleTest 
{

    @Test
    public void moduleObjectTest()
    {
    	Module moduleOne = new Module();
    	moduleOne.addCourses(new Course());
    	moduleOne.addCourses(new Course(), new Course());
    	
    	assertEquals(3, moduleOne.getCourses().size());
    	
    	Student s = new Student();
    	moduleOne.addStudents(s);
    	moduleOne.addStudents(new Student(), new Student());
    	
    	new Module().addStudents(s);
    	//Many of these empty module/course/student objects are to ensure branch coverage and that varargs work as expected.
    	
    	assertEquals(3, moduleOne.getStudents().size());
    	assertEquals(2, s.getModules().size());
    	//We are testing this aspect of students here as it is triggered my Module class logic.
    }
}
