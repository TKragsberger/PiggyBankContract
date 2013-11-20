package contract.dto;

/**
 *
 * @author Thomas Kragsberger
 */
public class MoneyMarketAccountDetail extends AccountDetail
{

    public MoneyMarketAccountDetail(CustomerDetail owner)
    {
        super(owner);
    }

    @Override
    public String getAccountType()
    {
        return "Money Market Account";
    }
    
    
}
