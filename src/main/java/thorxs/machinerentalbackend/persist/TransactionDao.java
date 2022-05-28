package thorxs.machinerentalbackend.persist;

import thorxs.machinerentalbackend.model.Transaction;

import java.util.List;

public interface TransactionDao {
    Transaction getTransaction(int id);
    List<Transaction> getAllTransactions();
    List<Transaction> getTransactionsForCompany(int companyId);
    void createTransaction(Transaction transaction);
    void updateTransaction(Transaction transaction);
    void deleteTransaction(int id);
}
