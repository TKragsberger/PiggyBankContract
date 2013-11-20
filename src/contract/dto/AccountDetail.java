package contract.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Thomas Kragsberger
 */
public abstract class AccountDetail implements Serializable
{
    private long accountId;
    private double balance;
    private CustomerDetail owner;
    private Collection<TransactionDetail> transactions = new ArrayList();

    public AccountDetail(CustomerDetail owner)
    {
        this.owner = owner;
    }

    public long getAccountId()
    {
        return accountId;
    }

    public void setAccountId(long accountId)
    {
        this.accountId = accountId;
    }

    public abstract String getAccountType();

    public double getBalance()
    {
        return balance;
    }

    public void addToBalance(double amount)
    {
        balance += amount;
    }

    public CustomerDetail getOwner()
    {
        return owner;
    }

    public void setOwner(CustomerDetail owner)
    {
        this.owner = owner;
    }

    public Collection<TransactionDetail> getTransactions()
    {
        return transactions;
    }

    public void setTransactions(Collection<TransactionDetail> transactions)
    {
        this.transactions = transactions;
    }
    
    public void addTransaction(TransactionDetail transactionDetail)
    {
        transactions.add(transactionDetail);
    }
    
}
