package thorxs.machinerentalbackend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import thorxs.machinerentalbackend.model.Transaction;
import thorxs.machinerentalbackend.service.TransactionService;

import java.util.List;

@Controller
public class TransactionController {
    private final TransactionService transactionService;

    @Autowired
    public TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @RequestMapping("/transaction/getAll")
    @ResponseBody
    public List<Transaction> getTransactionList() {
        return transactionService.listTransactions();
    }

    @RequestMapping("/transaction/getAll/{id}")
    @ResponseBody
    public List<Transaction> getTransactionsForCompany(@PathVariable String id) {
        return transactionService.listTransactionsForCompany(Integer.parseInt(id));
    }

    @RequestMapping("/transaction/{id}")
    @ResponseBody
    public Transaction getTransaction(@PathVariable String id) {
        return transactionService.getTransaction(Integer.parseInt(id));
    }

    @RequestMapping("/transaction/modify")
    @ResponseBody
    public String modifyTransaction(@RequestBody() Transaction transaction) {
        transactionService.modifyTransaction(transaction);

        return "Success";
    }

    @RequestMapping("/transaction/create")
    @ResponseBody
    public String createTransaction(@RequestBody Transaction transaction) {
        transactionService.createTransaction(transaction);

        return "Success";
    }

    @RequestMapping("/transaction/delete/{id}")
    @ResponseBody
    public String deleteTransaction(@PathVariable String id) {
        transactionService.deleteTransaction(Integer.parseInt(id));

        return "Success";
    }

    //TODO: Exception handling
}
