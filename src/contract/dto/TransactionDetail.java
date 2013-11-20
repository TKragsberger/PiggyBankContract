package contract.dto;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author Thomas Kragsberger
 */
public class TransactionDetail implements Serializable 
{
    private long transactionId;
    private Date timestamp;
    private double amount;
    private double balance;
    private String info;

    public TransactionDetail(double amount, AccountDetail source, AccountDetail target, String info)
    {
        this.timestamp = new Date();
        this.amount = amount;
        this.info = info;
        this.balance = balance;
    }

    public long getTransactionId()
    {
        return transactionId;
    }

    public void setTransactionId(long transactionId)
    {
        this.transactionId = transactionId;
    }

    public Date getTimestamp()
    {
        return timestamp;
    }

    public void setTimestamp(Date timestamp)
    {
        this.timestamp = timestamp;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public double getBalance()
    {
        return balance;
    }

    public void setBalance(double balance)
    {
        this.balance = balance;
    }

    public String getInfo()
    {
        return info;
    }

    public void setInfo(String info)
    {
        this.info = info;
    }
    
    
}
