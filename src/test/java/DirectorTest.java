import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Del", "DelDelDelDel", 1000000, "Dept.OfDadJokes",90000000.0);
    }

    @Test
    public void hasName(){
        assertEquals("Del", director.getName());
    }
}
