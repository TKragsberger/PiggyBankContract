package contract.dto;

/**
 *
 * @author Thomas Kragsberger
 */
public class TimeDepositAccountDetail extends AccountDetail
{

    public TimeDepositAccountDetail(CustomerDetail owner)
    {
        super(owner);
    }

    @Override
    public String getAccountType()
    {
        return "Time Deposit Account";
    }
    
    
}
