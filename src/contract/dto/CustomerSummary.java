package contract.dto;

import java.io.Serializable;

/**
 *
 * @author Thomas Kragsberger
 */
public class CustomerSummary implements Serializable
{
    private String email;
    private String firstName;
    private String lastName;

    public CustomerSummary(String email, String firstName, String lastName)
    {
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getEmail()
    {
        return email;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

}
