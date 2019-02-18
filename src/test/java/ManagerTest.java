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
}
