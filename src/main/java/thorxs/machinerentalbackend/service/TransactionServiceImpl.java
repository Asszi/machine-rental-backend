package thorxs.machinerentalbackend.service;

import org.springframework.stereotype.Service;
import thorxs.machinerentalbackend.model.Transaction;
import thorxs.machinerentalbackend.persist.TransactionDao;

import java.util.List;

@Service
public class TransactionServiceImpl implements  TransactionService{
    private final TransactionDao transactionDao;

    public TransactionServiceImpl(TransactionDao transactionDao) {
        this.transactionDao = transactionDao;
    }

    @Override
    public List<Transaction> listTransactions() {
        return transactionDao.getAllTransactions();
    }

    @Override
    public List<Transaction> listTransactionsForCompany(int companyId) {
        return transactionDao.getTransactionsForCompany(companyId);
    }

    @Override
    public Transaction getTransaction(int id) {
        return transactionDao.getTransaction(id);
    }

    @Override
    public void createTransaction(Transaction transaction) {
        transactionDao.createTransaction(transaction);
    }

    @Override
    public void modifyTransaction(Transaction transaction) {
        transactionDao.updateTransaction(transaction);
    }

    @Override
    public void deleteTransaction(int id) {
        transactionDao.deleteTransaction(id);
    }
}
