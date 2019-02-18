import org.junit.Before;
import org.junit.Test;
import staff.Employee;
import staff.techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {
    Employee employee;

    @Before
    public void before(){
        employee = new Developer("Alex", "JK889765", 40000);
    }

    @Test
    public void cantGetNegativeRaise(){
        employee.raiseSalary(-5000);
        assertEquals(40000, employee.getSalary());
    }

    @Test
    public void cantLeaveEmployeeNameEmpty(){
        employee.setName("");
        assertEquals("Alex", employee.getName());
    }
}
