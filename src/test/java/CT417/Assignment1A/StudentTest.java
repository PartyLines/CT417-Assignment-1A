package CT417.Assignment1A;

import static org.junit.Assert.assertEquals;

import org.joda.time.DateTime;
import org.junit.Test;

import CT417.Assignment1A.Student;

/**
 * Unit test for simple App.
 */
public class StudentTest 
{

    @Test
    public void studentObjectTest()
    {
    	Student student = new Student();
    	student.setName("Thady McGee");
    	student.setDateOfBirth(new DateTime(0).withDate(1995, 1, 1));
    	
    	int expectedAge = DateTime.now().year().get() - 1995;
        assertEquals("ThadyMcGee" + expectedAge, student.getUsername()); //The method also removes spaces from the name
        assertEquals(expectedAge, student.getAge());
    }
}
