import org.junit.Before;
import org.junit.Test;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Joe", "123456789Joe", 700000);
    }

    @Test
    public void developerHasName(){
        assertEquals("Joe", developer.getName());
    }

    @Test
    public void developerHasNI(){
        assertEquals("123456789Joe", developer.getNI());
    }

    @Test
    public void developerHasSalary(){
        assertEquals(700000,developer.getSalary());
    }

}
