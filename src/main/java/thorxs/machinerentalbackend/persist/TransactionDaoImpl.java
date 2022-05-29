package thorxs.machinerentalbackend.persist;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import thorxs.machinerentalbackend.model.Rental;
import thorxs.machinerentalbackend.model.Transaction;

import java.time.LocalDateTime;
import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

@Component
public class TransactionDaoImpl implements TransactionDao {
    private Map<Integer, Transaction> transactionMap;

    @Autowired
    public void TransactionDao() {
        transactionMap = new HashMap<>();
        transactionMap.put(1, new Transaction(1, 1, 20000, LocalDateTime.now()));
        transactionMap.put(2, new Transaction(2, 1, 40000, LocalDateTime.now()));
        transactionMap.put(3, new Transaction(3, 2, 20000, LocalDateTime.now()));
        transactionMap.put(4, new Transaction(4, 3, 20000, LocalDateTime.now()));
    }

    @Override
    public Transaction getTransaction(int id) {
        return transactionMap.get(id);
    }

    @Override
    public List<Transaction> getAllTransactions() {
        return new ArrayList<>(transactionMap.values());
    }

    @Override
    public List<Transaction> getTransactionsForCompany(int companyId) {
        return transactionMap.values().stream().filter(transactionIsForCompany(companyId)).collect(Collectors.toList());
    }

    @Override
    public void createTransaction(Transaction transaction) {
        int randomId = new Random().nextInt(Integer.SIZE - 1);
        transaction.setId(randomId);
        transactionMap.put(randomId, transaction);
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        transactionMap.replace(transaction.getId(), transaction);
    }

    @Override
    public void deleteTransaction(int id) {
        transactionMap.remove(id);
    }

    private Predicate<Transaction> transactionIsForCompany(int companyId) {
        return p -> p.getCompanyId() == companyId;
    }
}
