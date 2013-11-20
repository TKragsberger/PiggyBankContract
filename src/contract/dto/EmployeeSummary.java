package contract.dto;

import java.io.Serializable;

/**
 *
 * @author Thomas Kragsberger
 */
public class EmployeeSummary implements Serializable
{
    private String firstName;
    private String lastName;
    private long employeeId;

    public EmployeeSummary(String lastName, long employeeId)
    {
        this.lastName = lastName;
        this.employeeId = employeeId;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public long getEmployeeId()
    {
        return employeeId;
    }

    public void setEmployeeId(long employeeId)
    {
        this.employeeId = employeeId;
    }
    
    
}
