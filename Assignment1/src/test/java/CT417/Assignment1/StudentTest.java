package CT417.Assignment1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class StudentTest 
{
    /**
     * Currently only one method contains logic.
     */
    @Test
    public void shouldAnswerWithTrue()
    {
    	Student student = new Student();
    	student.setName("Thady McGee");
    	student.setAge(23);
        assertEquals("ThadyMcGee23", student.getUsername());
        //The method also removes spaces from the name
    }
}
