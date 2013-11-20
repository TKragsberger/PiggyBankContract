package contract.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 *
 * @author Thomas Kragsberger
 */
public class CustomerDetail implements Serializable
{
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private long customerId;
    private Collection<AccountDetail> accounts = new ArrayList();

    public CustomerDetail(String firstName, String lastName, String email, String password)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
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

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPassword()
    {
        return password;
    }

    public void setPassword(String password)
    {
        this.password = password;
    }

    public long getCustomerId()
    {
        return customerId;
    }

    public void setCustomerId(long customerId)
    {
        this.customerId = customerId;
    }

    public Collection<AccountDetail> getAccounts()
    {
        return accounts;
    }

    public void setAccounts(Collection<AccountDetail> accounts)
    {
        this.accounts = accounts;
    }
    
    public void addAccount(AccountDetail account)
    {
        accounts.add(account);
        account.setOwner(this);
    }
}
