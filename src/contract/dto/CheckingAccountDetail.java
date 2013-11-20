package contract.dto;

/**
 *
 * @author Thomas Kragsberger
 */
public class CheckingAccountDetail extends AccountDetail
{

    public CheckingAccountDetail(CustomerDetail owner)
    {
        super(owner);
    }
    
    @Override
    public String getAccountType()
    {
        return "Checking Account";
    }
    
}
