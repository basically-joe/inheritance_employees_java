import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Jon", "223ed445", 400000, "IT");
    }

    @Test
    public void canGetName(){
        assertEquals("Jon", manager.getName());
    }
    @Test
    public void canGetNI(){
        assertEquals("223ed445", manager.getNI());
    }

    @Test
    public void canGetSalary(){
        assertEquals(400000, manager.getSalary());
    }
}
