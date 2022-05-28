package thorxs.machinerentalbackend.service;

import thorxs.machinerentalbackend.model.Transaction;

import java.util.List;

public interface TransactionService {
    List<Transaction> listTransactions();
    List<Transaction> listTransactionsForCompany(int companyId);
    Transaction getTransaction(int id);
    void createTransaction(Transaction transaction);
    void modifyTransaction(Transaction transaction);
    void deleteTransaction(int id);
}
