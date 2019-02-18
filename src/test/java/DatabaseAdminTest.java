import org.junit.Before;
import org.junit.Test;
import staff.techStaff.DatabaseAdmin;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    DatabaseAdmin databaseAdmin;
    @Before
    public void before(){
        this.databaseAdmin = new DatabaseAdmin("Colin", "123456DD78", 35000);
    }
    @Test
    public void canGetName(){
        assertEquals("Colin", databaseAdmin.getName());
    }
}
