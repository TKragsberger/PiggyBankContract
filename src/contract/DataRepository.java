package contract;

import contract.dto.AccountDetail;
import contract.dto.CustomerDetail;
import contract.dto.CustomerSummary;
import contract.dto.EmployeeDetail;
import contract.dto.TransactionDetail;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.ejb.Remote;

@Remote
public interface DataRepository {
    public Collection<AccountDetail> getAccountSummay();
    public Collection<CustomerSummary> getCustomers();
    public AccountDetail getAccount(int id);
    public Collection<TransactionDetail> getTransactions(int id);
    public void saveCustomerDetail(CustomerDetail customer);
    public CustomerDetail getCustomerDetail(int id);
    public CustomerDetail getOwner(String email);
    public void transferMoney(int sendingAccount, int recievingAccount, 
            double amount, String messageToSender, String messageToReciever);
    public void deposit(int accountId, double amount);
    public void withdraw(int accountId, double amount);
    public void saveAccount(AccountDetail account);
    public EmployeeDetail getEmployeeLogon(String email);
}
