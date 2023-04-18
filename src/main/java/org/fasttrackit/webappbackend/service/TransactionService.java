package org.fasttrackit.webappbackend.service;

import org.fasttrackit.webappbackend.model.Transaction;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
public class TransactionService {
    private List<Transaction> transactions;

    public TransactionService(List<Transaction> transactions) {
        if (transactions != null) {
            this.transactions = transactions;
        }
    }

    public List<Transaction> getAllTransactions(){
        return transactions;
    }


    public Transaction getTransactionWithId(String id) {
        return transactions.stream()
                .filter(transaction -> transaction.equals(id))
                .findFirst()
                .orElseThrow(()-> new RuntimeException());
    }

    public Transaction addsNewTransaction(Transaction addTransaction) {
        return null;
    }

    public Transaction replaceTransaction(String id, Transaction replaceTransaction) {
        Transaction foundTransaction = getTransactionWithId(id);
        deletedWithIdd(id);
        Transaction updateTransaction = Transaction.builder()
                .id(foundTransaction.getId())
                .product(foundTransaction.getProduct())
                .type(foundTransaction.getType())
                .amount(foundTransaction.getAmount())
                .build();
        transactions.add(updateTransaction);
        return updateTransaction;
    }

    public Transaction deletedWithIdd(String id) {
        Transaction deletedTransaction = getTransactionWithId(id);
        transactions.remove(deletedTransaction);
        return deletedTransaction;
    }


}
